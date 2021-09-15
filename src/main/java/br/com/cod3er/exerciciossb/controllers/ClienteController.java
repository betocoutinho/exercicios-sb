package br.com.cod3er.exerciciossb.controllers;

import br.com.cod3er.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(2, "Roberto", "98797454612");
    }

    @GetMapping("/{id}")
    public Cliente obterClieteId1(@PathVariable int id){
        return new Cliente(id, "roberto", "56465456132");
    }

    @GetMapping
    public Cliente obterClieteId2(@RequestParam(name = "id") int id){
        return new Cliente(id, "roberto", "56465456132");
    }


}
