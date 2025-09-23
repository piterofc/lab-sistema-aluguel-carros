package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Rendimento extends Entidade {
    private Double valor;
    private String fonte;
    private String competencia;

    public void validar() {}
}