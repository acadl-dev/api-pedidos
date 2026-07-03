package com.acadl.aula11.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String descricao;

    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    @JsonIgnore
    public Cliente cliente;
}
