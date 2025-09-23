package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Cliente;

public class ClienteRepository extends ArquivoRepository<Cliente> {
    public ClienteRepository() {
        super("clientes.dat");
    }
}