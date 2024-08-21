package com.github.pedrobonelli.ms_pedidos.repository;

import com.github.pedrobonelli.ms_pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
