package com.github.pedrobonelli.ms_pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pedido {

    private Long id;
    private LocalDateTime dataHora;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "pedido")
    private List<ItemDoPedido> itensDoPedido;

}
