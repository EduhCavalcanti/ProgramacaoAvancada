package com.example.demo.Models;

import java.util.Date;

public class Feriado {
    private int IdFeriado;
    private Date DataFeriado;
    public String Descricao;

    public int getIdFeriado() {
        return IdFeriado;
    }

    public void setIdFeriado(int idFeriado) {
        IdFeriado = idFeriado;
    }

    public Date getDataFeriado() {
        return DataFeriado;
    }

    public void setDataFeriado(Date dataFeriado) {
        DataFeriado = dataFeriado;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
