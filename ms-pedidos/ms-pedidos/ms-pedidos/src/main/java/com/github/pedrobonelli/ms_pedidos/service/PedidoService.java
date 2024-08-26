package com.github.pedrobonelli.ms_pedidos.service;

import com.github.pedrobonelli.ms_pedidos.dto.ItemDoPedidoDTO;
import com.github.pedrobonelli.ms_pedidos.dto.PedidoDTO;
import com.github.pedrobonelli.ms_pedidos.model.ItemDoPedido;
import com.github.pedrobonelli.ms_pedidos.model.Pedido;
import com.github.pedrobonelli.ms_pedidos.repository.PedidoRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private final ModelMapper modelMapper;

    @Transactional
    public List<PedidoDTO> findAll(){
        return repository.findAll().stream()
                .map(pedido -> modelMapper.map(pedido, PedidoDTO.class))
                .collect(Collectors.toList());
    }

    public PedidoDTO findById(Long id){
        return modelMapper.map(repository.findById(id).orElseThrow(() -> new IllegalArgumentException("CAEMLO")), PedidoDTO.class);
    }
}
