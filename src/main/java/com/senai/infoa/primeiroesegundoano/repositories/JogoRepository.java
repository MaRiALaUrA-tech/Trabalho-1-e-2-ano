package com.senai.infoa.primeiroesegundoano.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.primeiroesegundoano.models.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Integer>{  
    
}