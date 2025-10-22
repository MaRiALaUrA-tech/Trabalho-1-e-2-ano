package com.senai.infoa.primeiroesegundoano.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.primeiroesegundoano.models.Cliente;
import com.senai.infoa.primeiroesegundoano.repositories.ClienteRepository;


@Service 
public class ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
  

   public String login(String cpf, String senha){
    Cliente cliente = clienteRepository.findByCpf(cpf);
    if(cliente != null && senha.equals(cliente.getSenha())){
        return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar login";
    }

    
      public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);

        }

        public List<Cliente> listarTodos(){
            return clienteRepository.findAll();
        }

        
}
   