package com.acadl.aula11.controller;

import com.acadl.aula11.entities.Cliente;
import com.acadl.aula11.services.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){

        return this.clienteService.salvar(cliente);
    }

}
