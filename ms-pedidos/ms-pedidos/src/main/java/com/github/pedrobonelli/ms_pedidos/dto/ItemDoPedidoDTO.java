package com.github.pedrobonelli.ms_pedidos.dto;

import com.github.pedrobonelli.ms_pedidos.model.ItemDoPedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ItemDoPedidoDTO {

    private Long id;
    private Integer quantidade;
    private String descricao;
    private Long pedidoId;

    public ItemDoPedidoDTO(ItemDoPedido entity){
        this.id = entity.getId();
        this.descricao = entity.getDescricao();
        this.descricao = entity.getDescricao();
        this.pedidoId = entity.getPedido().getId();
    }

}
