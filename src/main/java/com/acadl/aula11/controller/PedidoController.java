package com.acadl.aula11.controller;

import com.acadl.aula11.entities.Pedido;
import com.acadl.aula11.services.PedidoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos/{idCliente}")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido, @PathVariable Long idCliente){
        return this.service.salvar(pedido, idCliente);
    }
}
