package com.senai.infoa.primeiroesegundoano.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Void Games",
        version = "1.0",
        description = "arthur.pales@aluno.senai.br"
    )
)

public class Swagger {
    
}
