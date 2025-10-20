package com.senai.infoa.primeiroesegundoano.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.primeiroesegundoano.models.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{  
    
}