package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.ContratoCredito;
import com.universidade.aluguelcarros.repository.ContratoCreditoRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contratoscredito")
public class ContratoCreditoController {

    private final ContratoCreditoRepository contratoCreditoRepository = new ContratoCreditoRepository();

    @PostMapping
    @Operation(summary = "Criar novo contrato de crédito")
    public ContratoCredito criar(@RequestBody ContratoCredito contratoCredito) {
        return contratoCreditoRepository.salvar(contratoCredito);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar contrato de crédito por ID")
    public Optional<ContratoCredito> buscar(@PathVariable Long id) {
        return contratoCreditoRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os contratos de crédito")
    public List<ContratoCredito> listar() {
        return contratoCreditoRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar contrato de crédito")
    public ContratoCredito atualizar(@PathVariable Long id, @RequestBody ContratoCredito contratoCredito) {
        contratoCredito.setId(id);
        return contratoCreditoRepository.salvar(contratoCredito);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar contrato de crédito")
    public void deletar(@PathVariable Long id) {
        contratoCreditoRepository.deletarPorId(id);
    }
}