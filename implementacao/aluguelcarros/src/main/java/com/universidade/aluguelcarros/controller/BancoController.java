package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Banco;
import com.universidade.aluguelcarros.repository.BancoRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bancos")
public class BancoController {

    private final BancoRepository bancoRepository = new BancoRepository();

    @PostMapping
    @Operation(summary = "Criar novo banco")
    public Banco criar(@RequestBody Banco banco) {
        return bancoRepository.salvar(banco);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar banco por ID")
    public Optional<Banco> buscar(@PathVariable Long id) {
        return bancoRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os bancos")
    public List<Banco> listar() {
        return bancoRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar banco")
    public Banco atualizar(@PathVariable Long id, @RequestBody Banco banco) {
        banco.setId(id);
        return bancoRepository.salvar(banco);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar banco")
    public void deletar(@PathVariable Long id) {
        bancoRepository.deletarPorId(id);
    }
}