package com.example.demo.Models;

public class Professor {
    private int IdProfessor;
    private String nome;
    private String Telefone;
    private Float ValorHoraAula;

    public int getIdProfessor() {
        return IdProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        IdProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public Float getValorHoraAula() {
        return ValorHoraAula;
    }

    public void setValorHoraAula(Float valorHoraAula) {
        ValorHoraAula = valorHoraAula;
    }
}
