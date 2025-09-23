package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Automovel extends Entidade {
    private Integer matricula;
    private Integer ano;
    private String marca;
    private String modelo;
    private String placa;

    public void registrar() {}
}