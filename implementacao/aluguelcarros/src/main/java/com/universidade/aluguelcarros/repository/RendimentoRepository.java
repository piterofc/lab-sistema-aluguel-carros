package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Rendimento;

public class RendimentoRepository extends ArquivoRepository<Rendimento> {
    public RendimentoRepository() {
        super("rendimentos.dat");
    }
}