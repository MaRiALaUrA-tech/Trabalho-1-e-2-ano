package com.senai.infoa.primeiroesegundoano.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


import com.senai.infoa.primeiroesegundoano.models.Cliente;
import com.senai.infoa.primeiroesegundoano.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired 
    private ClienteService clienteService;

    @PostMapping("/login")
    public String login(@RequestParam String cpf, @RequestParam String senha) {
        return clienteService.login(cpf,senha);
    }

    @PostMapping("/salvar")
     public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
 }
   
    @GetMapping("/listar")
    public List<Cliente> listarTodos(){
        return clienteService.listarTodos();
    }

}