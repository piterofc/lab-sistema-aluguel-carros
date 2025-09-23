package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Entidade;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public abstract class ArquivoRepository<T extends Entidade> {

    private final String NOME_ARQUIVO;
    private final Map<Long, T> cache = new ConcurrentHashMap<>();
    private final AtomicLong sequence;

    public ArquivoRepository(String nomeArquivo) {
        this.NOME_ARQUIVO = nomeArquivo;
        carregarDoArquivo();
        long maxId = cache.keySet().stream().max(Long::compare).orElse(0L);
        this.sequence = new AtomicLong(maxId);
    }

    public T salvar(T entidade) {
        if (entidade.getId() == null) {
            entidade.setId(sequence.incrementAndGet());
        }
        cache.put(entidade.getId(), entidade);
        salvarNoArquivo();
        return entidade;
    }

    public Optional<T> buscarPorId(Long id) {
        return Optional.ofNullable(cache.get(id));
    }

    public List<T> listarTodos() {
        return new ArrayList<>(cache.values());
    }

    public void deletarPorId(Long id) {
        cache.remove(id);
        salvarNoArquivo();
    }

    @SuppressWarnings("unchecked")
    private void carregarDoArquivo() {
        File file = new File(NOME_ARQUIVO);
        if (!file.exists()) {
            return;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Map<Long, T> dados = (Map<Long, T>) ois.readObject();
            cache.putAll(dados);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar dados do arquivo: " + NOME_ARQUIVO);
            e.printStackTrace();
        }
    }

    private synchronized void salvarNoArquivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOME_ARQUIVO))) {
            oos.writeObject(cache);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados no arquivo: " + NOME_ARQUIVO);
            e.printStackTrace();
        }
    }
}