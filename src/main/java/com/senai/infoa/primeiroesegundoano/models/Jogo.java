package com.senai.infoa.primeiroesegundoano.models;

import java.time.LocalDate;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="jogo")
public class Jogo{
    @Id      
    @GeneratedValue(strategy=GenarationType.IDENTITY)
    @Column(name="jogo_id")
    private Integer jogoId;

    @Column(name="nome")
    private String nomeJogo;

    @Column(name="genero")
    private String  genero;

    @Column(name="data_lancamento")
    private LocalDate dataLancamento;

    @Column(name="tamanho")
    private double  tamanho;

    public Jogo (){}

    public Jogo(String nomeJogo, String genero, LocalDate dataLancamento, double tamanho){
        this.nomeJogo = nomeJogo;
        this.genero = genero;
        this.dataLancamento = dataLancamento;
        this.tamanho = tamanho;
    }

    public Integer getJogoId() {
        return jogoId;
    }

    public void setJogoId(Integer jogoId) {
        this.jogoId = jogoId;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    






    
}
    