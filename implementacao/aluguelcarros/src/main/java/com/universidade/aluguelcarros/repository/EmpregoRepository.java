package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Emprego;

public class EmpregoRepository extends ArquivoRepository<Emprego> {
    public EmpregoRepository() {
        super("empregos.dat");
    }
}