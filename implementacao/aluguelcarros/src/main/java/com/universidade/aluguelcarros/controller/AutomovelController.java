package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Automovel;
import com.universidade.aluguelcarros.repository.AutomovelRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/automoveis")
public class AutomovelController {

    private final AutomovelRepository automovelRepository = new AutomovelRepository();

    @PostMapping
    @Operation(summary = "Criar novo automóvel")
    public Automovel criar(@RequestBody Automovel automovel) {
        return automovelRepository.salvar(automovel);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar automóvel por ID")
    public Optional<Automovel> buscar(@PathVariable Long id) {
        return automovelRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os automóveis")
    public List<Automovel> listar() {
        return automovelRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar automóvel")
    public Automovel atualizar(@PathVariable Long id, @RequestBody Automovel automovel) {
        automovel.setId(id);
        return automovelRepository.salvar(automovel);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar automóvel")
    public void deletar(@PathVariable Long id) {
        automovelRepository.deletarPorId(id);
    }
}