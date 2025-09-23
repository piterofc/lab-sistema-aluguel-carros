package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Automovel;

public class AutomovelRepository extends ArquivoRepository<Automovel> {
    public AutomovelRepository() {
        super("automoveis.dat");
    }
}