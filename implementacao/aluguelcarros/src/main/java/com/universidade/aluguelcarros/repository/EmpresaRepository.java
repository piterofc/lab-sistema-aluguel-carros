package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Empresa;

public class EmpresaRepository extends ArquivoRepository<Empresa> {
    public EmpresaRepository() {
        super("empresas.dat");
    }
}