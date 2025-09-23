package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Banco extends Entidade {
    private String codigoBanco;

    public void concederCredito() {}
    public void avaliarPedido() {}
}