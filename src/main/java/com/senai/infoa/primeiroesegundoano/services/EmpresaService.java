package com.senai.infoa.primeiroesegundoano.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.primeiroesegundoano.models.Empresa;
import com.senai.infoa.primeiroesegundoano.repositories.EmpresaRepository;


@Service 
public class EmpresaService{

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> listarTodos(){
            return empresaRepository.findAll();
        }

    public Empresa salvar(Empresa empresa){
            return empresaRepository.save(empresa);

        }

   

}