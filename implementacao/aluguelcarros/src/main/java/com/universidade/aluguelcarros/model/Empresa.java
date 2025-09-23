package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Empresa extends Entidade {
    private String segmento;

    public void classificarRisco() {}
}