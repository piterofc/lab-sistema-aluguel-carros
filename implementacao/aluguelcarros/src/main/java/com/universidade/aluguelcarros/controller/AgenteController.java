package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Agente;
import com.universidade.aluguelcarros.repository.AgenteRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/agentes")
public class AgenteController {

    private final AgenteRepository agenteRepository = new AgenteRepository();

    @PostMapping
    @Operation(summary = "Criar novo agente")
    public Agente criar(@RequestBody Agente agente) {
        return agenteRepository.salvar(agente);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar agente por ID")
    public Optional<Agente> buscar(@PathVariable Long id) {
        return agenteRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os agentes")
    public List<Agente> listar() {
        return agenteRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar agente")
    public Agente atualizar(@PathVariable Long id, @RequestBody Agente agente) {
        agente.setId(id);
        return agenteRepository.salvar(agente);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar agente")
    public void deletar(@PathVariable Long id) {
        agenteRepository.deletarPorId(id);
    }
}