package com.acadl.aula11.services;

import com.acadl.aula11.entities.Cliente;
import com.acadl.aula11.entities.Pedido;
import com.acadl.aula11.repositories.ClienteRepository;
import com.acadl.aula11.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private final PedidoRepository repository;
    private final ClienteRepository clienteRepository;

    public PedidoService(PedidoRepository repository, ClienteRepository clienteRepository) {
        this.repository = repository;
        this.clienteRepository = clienteRepository;
    }

    public Pedido salvar(Pedido pedido, Long idCliente){
        Cliente cliente = this.clienteRepository.findById(idCliente).orElseThrow(()-> new RuntimeException("Cliente não encontrado!"));

        pedido.cliente = cliente;

        return this.repository.save(pedido);
    }
}
