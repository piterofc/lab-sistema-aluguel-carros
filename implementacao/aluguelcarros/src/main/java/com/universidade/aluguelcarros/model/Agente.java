package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Agente extends Entidade {
    private String razaoSocial;
    private String cnpj;

    public void avaliarPedido() {}
    public void modificarPedido() {}
}