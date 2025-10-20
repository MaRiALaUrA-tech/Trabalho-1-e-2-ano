package com.senai.infoa.primeiroesegundoano.models;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

@Entity 
@Table(name="cliente")
public class Cliente{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cliente_id")
    private Integer clienteId;

    @Column ( name = "nome")
    private  String nome;

    @Column ( name = "senha")
    private String senha;

    @Column ( name = "cpf")
    private String cpf;

    @Column ( name = "email")
    private  String email;

    public Cliente () {}

    public Cliente(String nome, String senha, String cpf, String email) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.email = email;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}