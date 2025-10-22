package com.senai.infoa.primeiroesegundoano.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.primeiroesegundoano.models.Jogo;
import com.senai.infoa.primeiroesegundoano.services.JogoService;

@RestController
@RequestMapping("/jogo")
public class JogoController {
    
    @Autowired 
    private JogoService jogoService;

    @GetMapping("/listar")
    public List<Jogo> listarTodos(){
        return jogoService.listarTodos();
    }

     @PostMapping("/salvar")
     public Jogo salvar(@RequestBody Jogo jogo) {
        return jogoService.salvar(jogo);
 }



}