package com.senai.infoa.primeiroesegundoano.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.infoa.primeiroesegundoano.models.Cliente;
import com.senai.infoa.primeiroesegundoano.repositories.ClienteRepository;

@Service 
public class ClienteService{

     public List<Cliente> listarTodos(){
            return ClienteRepository.findAll();
        }


}
   