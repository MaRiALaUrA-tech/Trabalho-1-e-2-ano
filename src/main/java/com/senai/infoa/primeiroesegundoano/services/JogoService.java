package com.senai.infoa.primeiroesegundoano.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.primeiroesegundoano.models.Jogo;
import com.senai.infoa.primeiroesegundoano.repositories.JogoRepository;

@Service 
public class JogoService{

    @Autowired
    private JogoRepository jogoRepository;
    public List<Jogo> listarTodos(){
        return jogoRepository.findAll();
        }

    public Jogo salvar(Jogo jogo){
        return jogoRepository.save(jogo);

        }

   

}