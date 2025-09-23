package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Empresa;
import com.universidade.aluguelcarros.repository.EmpresaRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    private final EmpresaRepository empresaRepository = new EmpresaRepository();

    @PostMapping
    @Operation(summary = "Criar nova empresa")
    public Empresa criar(@RequestBody Empresa empresa) {
        return empresaRepository.salvar(empresa);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar empresa por ID")
    public Optional<Empresa> buscar(@PathVariable Long id) {
        return empresaRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todas as empresas")
    public List<Empresa> listar() {
        return empresaRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar empresa")
    public Empresa atualizar(@PathVariable Long id, @RequestBody Empresa empresa) {
        empresa.setId(id);
        return empresaRepository.salvar(empresa);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar empresa")
    public void deletar(@PathVariable Long id) {
        empresaRepository.deletarPorId(id);
    }
}