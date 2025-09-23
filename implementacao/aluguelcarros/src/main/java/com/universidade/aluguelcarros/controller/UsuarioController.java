package com.universidade.aluguelcarros.controller;

import com.universidade.aluguelcarros.model.Usuario;
import com.universidade.aluguelcarros.repository.UsuarioRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository = new UsuarioRepository();

    @PostMapping
    @Operation(summary = "Criar novo usuário")
    public Usuario criar(@RequestBody Usuario usuario) {
        return usuarioRepository.salvar(usuario);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar usuário por ID")
    public Optional<Usuario> buscar(@PathVariable Long id) {
        return usuarioRepository.buscarPorId(id);
    }

    @GetMapping
    @Operation(summary = "Listar todos os usuários")
    public List<Usuario> listar() {
        return usuarioRepository.listarTodos();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar usuário")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return usuarioRepository.salvar(usuario);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar usuário")
    public void deletar(@PathVariable Long id) {
        usuarioRepository.deletarPorId(id);
    }
}