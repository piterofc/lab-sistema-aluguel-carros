package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Pedido;
import com.universidade.aluguelcarros.repository.PedidoRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoRepository pedidoRepository = new PedidoRepository();

    @PostMapping
    @Operation(summary = "Criar novo pedido")
    public Pedido criar(@RequestBody Pedido pedido) {
        pedido.setSituacao("Novo");
        return pedidoRepository.salvar(pedido);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar pedido por ID")
    public Optional<Pedido> buscar(@PathVariable Long id) {
        return pedidoRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os pedidos")
    public List<Pedido> listar() {
        return pedidoRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar pedido")
    public Pedido atualizar(@PathVariable Long id, @RequestBody Pedido pedido) {
        pedido.setId(id);
        return pedidoRepository.salvar(pedido);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar pedido")
    public void deletar(@PathVariable Long id) {
        pedidoRepository.deletarPorId(id);
    }
}