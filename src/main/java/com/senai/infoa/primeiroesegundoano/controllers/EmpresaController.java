package com.senai.infoa.primeiroesegundoano.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.primeiroesegundoano.models.Empresa;
import com.senai.infoa.primeiroesegundoano.services.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    
    @Autowired
    private EmpresaService empresaService;
    @GetMapping("/listar")
    public List<Empresa> listarTodos(){
        return empresaService.listarTodos();
    }
}