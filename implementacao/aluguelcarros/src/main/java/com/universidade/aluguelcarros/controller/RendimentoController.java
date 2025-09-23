package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Rendimento;
import com.universidade.aluguelcarros.repository.RendimentoRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rendimentos")
public class RendimentoController {

    private final RendimentoRepository rendimentoRepository = new RendimentoRepository();

    @PostMapping
    @Operation(summary = "Criar novo rendimento")
    public Rendimento criar(@RequestBody Rendimento rendimento) {
        return rendimentoRepository.salvar(rendimento);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar rendimento por ID")
    public Optional<Rendimento> buscar(@PathVariable Long id) {
        return rendimentoRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os rendimentos")
    public List<Rendimento> listar() {
        return rendimentoRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar rendimento")
    public Rendimento atualizar(@PathVariable Long id, @RequestBody Rendimento rendimento) {
        rendimento.setId(id);
        return rendimentoRepository.salvar(rendimento);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar rendimento")
    public void deletar(@PathVariable Long id) {
        rendimentoRepository.deletarPorId(id);
    }
}