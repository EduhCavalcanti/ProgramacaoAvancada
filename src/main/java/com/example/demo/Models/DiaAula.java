package com.example.demo.Models;

public class DiaAula {
    private int IdDiaAula;
    public int IdCurso;
    public Curso Curso;

    private int DataAula;

    public int getIdDiaAula() {
        return IdDiaAula;
    }

    public void setIdDiaAula(int idDiaAula) {
        IdDiaAula = idDiaAula;
    }

    public int getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(int idCurso) {
        IdCurso = idCurso;
    }

    public com.example.demo.Models.Curso getCurso() {
        return Curso;
    }

    public void setCurso(com.example.demo.Models.Curso curso) {
        Curso = curso;
    }

    public int getDataAula() {
        return DataAula;
    }

    public void setDataAula(int dataAula) {
        DataAula = dataAula;
    }
}
