package com.example.demo.Models;

import java.util.Date;

public class Lead {
    private int IdLead;
    private String Nome;
    private String Telefone;
    private Date DataCadastro;
    private String Status;
    private Date DataNovoContato;
    private String Observacao;

    public int getIdLead() {
        return IdLead;
    }

    public void setIdLead(int idLead) {
        IdLead = idLead;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public Date getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        DataCadastro = dataCadastro;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getDataNovoContato() {
        return DataNovoContato;
    }

    public void setDataNovoContato(Date dataNovoContato) {
        DataNovoContato = dataNovoContato;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String observacao) {
        Observacao = observacao;
    }
}
