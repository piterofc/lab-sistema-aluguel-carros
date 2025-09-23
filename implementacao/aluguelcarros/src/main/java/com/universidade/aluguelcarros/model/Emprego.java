package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Emprego extends Entidade {
    private String entidadeEmpregadora;
    private String cargo;
    private Integer dataAdmissao;

    public void calcularTempo() {}
}