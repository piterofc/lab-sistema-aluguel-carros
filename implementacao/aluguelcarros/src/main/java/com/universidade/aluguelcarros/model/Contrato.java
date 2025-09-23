package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Contrato extends Entidade {
    private String status;
    private Integer dataInicio;
    private Integer dataFim;
    private Double valorMensal;
    private String propriedadeFinal;

    public void registrar() {}
    public void encerrar() {}
}