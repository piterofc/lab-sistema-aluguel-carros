package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Emprego;
import com.universidade.aluguelcarros.repository.EmpregoRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empregos")
public class EmpregoController {

    private final EmpregoRepository empregoRepository = new EmpregoRepository();

    @PostMapping
    @Operation(summary = "Criar novo emprego")
    public Emprego criar(@RequestBody Emprego emprego) {
        return empregoRepository.salvar(emprego);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar emprego por ID")
    public Optional<Emprego> buscar(@PathVariable Long id) {
        return empregoRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os empregos")
    public List<Emprego> listar() {
        return empregoRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar emprego")
    public Emprego atualizar(@PathVariable Long id, @RequestBody Emprego emprego) {
        emprego.setId(id);
        return empregoRepository.salvar(emprego);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar emprego")
    public void deletar(@PathVariable Long id) {
        empregoRepository.deletarPorId(id);
    }
}