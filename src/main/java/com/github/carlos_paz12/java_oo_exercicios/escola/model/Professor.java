package com.github.carlos_paz12.java_oo_exercicios.escola.model;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String matricula;
    private String nome;
    private List<Turma> turmas;

    public Professor() {
        turmas = new ArrayList<>();
    }

    public Professor(String matricula, String nome, List<Turma> turmas) {
        this.matricula = matricula;
        this.nome = nome;
        this.turmas = turmas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

}
