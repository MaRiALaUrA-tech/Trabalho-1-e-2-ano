package com.senai.infoa.primeiroesegundoano.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;


@Entity 
@Table(name="empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="empresa_id")
    private Integer empresaId;

    @Column(name="nome_empresa")
    private String nomeEmpresa;

    @Column(name="cnpj")
    private String cnpj;

    @Column(name="endereco")
    private String endereco;

    @Column(name="telefone")
    private Integer telefone;

    @Column(name="email")
    private String email;

    @Column(name="setor_principal")
    private String setorPrincipal;

    public Empresa() {}

    public Empresa(String nomeEmpresa, String cnpj, String endereco, Integer telefone, String email, String setorPrincipal){
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.email = email;
        this.setorPrincipal = setorPrincipal;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetorPrincipal() {
        return setorPrincipal;
    }

    public void setSetorPrincipal(String setorPrincipal) {
        this.setorPrincipal = setorPrincipal;
    }

    
}