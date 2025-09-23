package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Banco;

public class BancoRepository extends ArquivoRepository<Banco> {
    public BancoRepository() {
        super("bancos.dat");
    }
}