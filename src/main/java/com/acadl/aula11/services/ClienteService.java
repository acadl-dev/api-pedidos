package com.acadl.aula11.services;

import com.acadl.aula11.entities.Cliente;
import com.acadl.aula11.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente){
        return this.repository.save(cliente);
    }

}
