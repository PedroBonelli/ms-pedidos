package com.github.pedrobonelli.ms_pedidos.service;

import com.github.pedrobonelli.ms_pedidos.dto.ItemDoPedidoDTO;
import com.github.pedrobonelli.ms_pedidos.dto.PedidoDTO;
import com.github.pedrobonelli.ms_pedidos.model.ItemDoPedido;
import com.github.pedrobonelli.ms_pedidos.model.Pedido;
import com.github.pedrobonelli.ms_pedidos.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.ArrayList;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;



    private void copyDtoToEntity(PedidoDTO dto, Pedido entity){
        dto.setId(entity.getId());
        dto.setDataHora(entity.getDataHora());
        dto.setStatus(entity.getStatus());

        List<ItemDoPedidoDTO> itensDTO = new ArrayList<ItemDoPedidoDTO>();
        for(ItemDoPedido item : entity.getItensDoPedido()){
            new ItemDoPedidoDTO(item);
        }

        dto.setItensDoPedido(itensDTO);s
    }
}
