package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Contrato;
import com.universidade.aluguelcarros.repository.ContratoRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {

    private final ContratoRepository contratoRepository = new ContratoRepository();

    @PostMapping
    @Operation(summary = "Criar novo contrato")
    public Contrato criar(@RequestBody Contrato contrato) {
        return contratoRepository.salvar(contrato);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar contrato por ID")
    public Optional<Contrato> buscar(@PathVariable Long id) {
        return contratoRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os contratos")
    public List<Contrato> listar() {
        return contratoRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar contrato")
    public Contrato atualizar(@PathVariable Long id, @RequestBody Contrato contrato) {
        contrato.setId(id);
        return contratoRepository.salvar(contrato);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar contrato")
    public void deletar(@PathVariable Long id) {
        contratoRepository.deletarPorId(id);
    }
}