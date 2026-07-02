package com.acadl.aula11.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nome;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    public List<Pedido> pedidos;

}
