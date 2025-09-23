package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ContratoCredito extends Entidade {
    private Double valorTotal;
    private Double taxaJurosAnual;
    private Integer parcelas;
    private String status;

    public void registrar() {}
    public void aprovar() {}
    public void rejeitar() {}
}