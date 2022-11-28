package com.example.demo.Models;

public class Turma {
    private int IdTurma;
    public int IdAluno;
    public Aluno Aluno;
    public int IdCurso;
    public Curso Curso;
    public int IdProfessor;
    public Professor Professor;
    public Float Valor;

    public int getIdTurma() {
        return IdTurma;
    }

    public void setIdTurma(int idTurma) {
        IdTurma = idTurma;
    }

    public int getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(int idAluno) {
        IdAluno = idAluno;
    }

    public com.example.demo.Models.Aluno getAluno() {
        return Aluno;
    }

    public void setAluno(com.example.demo.Models.Aluno aluno) {
        Aluno = aluno;
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

    public int getIdProfessor() {
        return IdProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        IdProfessor = idProfessor;
    }

    public com.example.demo.Models.Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(com.example.demo.Models.Professor professor) {
        Professor = professor;
    }

    public Float getValor() {
        return Valor;
    }

    public void setValor(Float valor) {
        Valor = valor;
    }
}
