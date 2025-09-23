package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Contrato;

public class ContratoRepository extends ArquivoRepository<Contrato> {
    public ContratoRepository() {
        super("contratos.dat");
    }
}