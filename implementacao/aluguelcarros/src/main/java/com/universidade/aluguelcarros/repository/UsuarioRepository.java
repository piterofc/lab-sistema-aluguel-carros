package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Usuario;

public class UsuarioRepository extends ArquivoRepository<Usuario> {
    public UsuarioRepository() {
        super("usuarios.dat");
    }
}