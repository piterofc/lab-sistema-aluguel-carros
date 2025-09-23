package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Cliente;
import com.universidade.aluguelcarros.repository.ClienteRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository = new ClienteRepository();

    @PostMapping
    @Operation(summary = "Criar novo cliente")
    public Cliente criar(@RequestBody Cliente cliente) {
        return clienteRepository.salvar(cliente);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar cliente por ID")
    public Optional<Cliente> buscar(@PathVariable Long id) {
        return clienteRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os clientes")
    public List<Cliente> listar() {
        return clienteRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar cliente")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteRepository.salvar(cliente);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar cliente")
    public void deletar(@PathVariable Long id) {
        clienteRepository.deletarPorId(id);
    }
}