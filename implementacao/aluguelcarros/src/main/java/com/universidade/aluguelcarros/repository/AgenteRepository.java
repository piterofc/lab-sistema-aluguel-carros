package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Agente;

public class AgenteRepository extends ArquivoRepository<Agente> {
    public AgenteRepository() {
        super("agentes.dat");
    }
}