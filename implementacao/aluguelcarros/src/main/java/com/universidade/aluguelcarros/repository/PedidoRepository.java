package com.universidade.aluguelcarros.repository;

import com.universidade.aluguelcarros.model.Pedido;

public class PedidoRepository extends ArquivoRepository<Pedido> {
    public PedidoRepository() {
        super("pedidos.dat");
    }
}