package com.senai.infoa.primeiroesegundoano.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.primeiroesegundoano.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{  

@Query(value="select * from cliente where cpf = :cpf", nativeQuery=true)
    public Cliente findByCpf(String cpf);

}