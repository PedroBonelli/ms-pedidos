package com.github.pedrobonelli.ms_pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDoPedido {

    private Long id;
    private Integer quantidade;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id")
    private Pedido pedido;
}
