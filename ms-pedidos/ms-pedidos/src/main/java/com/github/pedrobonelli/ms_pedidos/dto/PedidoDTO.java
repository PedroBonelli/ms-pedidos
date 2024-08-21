package com.github.pedrobonelli.ms_pedidos.dto;

import com.github.pedrobonelli.ms_pedidos.model.ItemDoPedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.github.pedrobonelli.ms_pedidos.model.Pedido;
import com.github.pedrobonelli.ms_pedidos.model.Status;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class PedidoDTO {

    private Long id;
    private LocalDateTime dataHora;
    private Status status;
    private List<ItemDoPedidoDTO> itensDoPedido;

    public PedidoDTO(Pedido entity){
        this.id = entity.getId();
        this.dataHora  = entity.getDataHora();
        this.status = entity.getStatus();

        for(ItemDoPedido item : entity.getItensDoPedido()){
            this.itensDoPedido.add(new ItemDoPedidoDTO(item));
        }

    }

}
