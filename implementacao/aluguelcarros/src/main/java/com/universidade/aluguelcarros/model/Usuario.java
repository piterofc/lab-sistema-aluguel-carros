package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Usuario extends Entidade {
    private String email;
    private String senha;

    // Métodos de negócio simulados
    public void cadastrar() {}
    public void modificar() {}
}