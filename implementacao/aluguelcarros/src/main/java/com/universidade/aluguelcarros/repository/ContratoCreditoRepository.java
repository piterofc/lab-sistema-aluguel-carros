package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.ContratoCredito;

public class ContratoCreditoRepository extends ArquivoRepository<ContratoCredito> {
    public ContratoCreditoRepository() {
        super("contratoscredito.dat");
    }
}