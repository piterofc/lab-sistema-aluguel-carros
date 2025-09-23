package com.universidade.aluguelcarros.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Cliente extends Entidade {
    private String cpf;
    private String rg;
    private String nome;
    private String endereco;
    private String profissao;

    // Métodos de negócio simulados
    public void introduzirPedido() {}
    public void modificarPedido() {}
    public void cancelarPedido() {}
    public void consultarPedido() {}
}