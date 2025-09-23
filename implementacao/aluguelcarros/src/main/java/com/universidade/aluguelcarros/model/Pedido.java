package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Pedido extends Entidade {
    private String situacao;
    private String observacoesCliente;
    private String observacoesAgente;

    // IDs de relacionamento
    private Long clienteId;
    private Long agenteId;
    private Long automovelId;

    public void enviarParaAnalise() {}
    public void avaliar() {}
    public void atualizarStatus() {}
}