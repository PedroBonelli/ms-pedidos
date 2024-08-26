package com.github.pedrobonelli.ms_pedidos.controller;

import com.github.pedrobonelli.ms_pedidos.dto.PedidoDTO;
import com.github.pedrobonelli.ms_pedidos.service.PedidoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping()
    public ResponseEntity<List<PedidoDTO>> findAll(){
        List<PedidoDTO> dtos = service.findAll();
        return ResponseEntity.ok(dtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO> findById(@PathVariable("id") Long id){
        PedidoDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

}
