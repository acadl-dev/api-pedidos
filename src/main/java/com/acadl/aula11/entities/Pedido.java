package com.acadl.aula11.entities;

import jakarta.persistence.*;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String descricao;

    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    public Cliente cliente;
}
