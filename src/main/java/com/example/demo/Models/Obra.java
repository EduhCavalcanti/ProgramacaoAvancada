package com.example.demo.Models;

import java.math.BigInteger;

public class Obra {
    int Id;
    private String Nome;
    private int AnoConstruicao;
    private String Coordenacao;
    private String Gerencia;
    private String Diretoria;
    private String Outorga;
    private String Titularidade;

    public Obra(int id, String nome, int anoConstruicao, String coordenacao, String gerencia, String diretoria, String outorga, String titularidade) {
        Id = id;
        Nome = nome;
        AnoConstruicao = anoConstruicao;
        Coordenacao = coordenacao;
        Gerencia = gerencia;
        Diretoria = diretoria;
        Outorga = outorga;
        Titularidade = titularidade;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getAnoConstruicao() {
        return AnoConstruicao;
    }

    public void setAnoConstruicao(int anoConstruicao) {
        AnoConstruicao = anoConstruicao;
    }

    public String getCoordenacao() {
        return Coordenacao;
    }

    public void setCoordenacao(String coordenacao) {
        Coordenacao = coordenacao;
    }

    public String getGerencia() {
        return Gerencia;
    }

    public void setGerencia(String gerencia) {
        Gerencia = gerencia;
    }

    public String getDiretoria() {
        return Diretoria;
    }

    public void setDiretoria(String diretoria) {
        Diretoria = diretoria;
    }

    public String getOutorga() {
        return Outorga;
    }

    public void setOutorga(String outorga) {
        Outorga = outorga;
    }

    public String getTitularidade() {
        return Titularidade;
    }

    public void setTitularidade(String titularidade) {
        Titularidade = titularidade;
    }
}
