package com.github.pedrobonelli.ms_pedidos.dto;

import com.github.pedrobonelli.ms_pedidos.model.ItemDoPedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ItemDoPedidoDTO {

    private Long id;
    private Integer quantidade;
    private String descricao;
    private Long pedidoId;


}
