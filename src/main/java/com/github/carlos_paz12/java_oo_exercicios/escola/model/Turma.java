package com.github.carlos_paz12.java_oo_exercicios.escola.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nome;
    private String turno;
    private Professor professorPrincipal;
    private Professor professorSubstituto;
    private List<Aluno> alunosCadastrados;

    public Turma(Professor professorPrincipal) {
        this.professorPrincipal = professorPrincipal;
        this.professorPrincipal.getTurmas().add(this);
        this.alunosCadastrados = new ArrayList<>();
    }

    public Turma(String nome, String turno, Professor professorPrincipal, Professor professorSubstituto, List<Aluno> alunosCadastrados) {
        this.nome = nome;
        this.turno = turno;
        this.professorPrincipal = professorPrincipal;
        this.professorSubstituto = professorSubstituto;
        this.alunosCadastrados = alunosCadastrados;
        this.professorPrincipal.getTurmas().add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Professor getProfessorPrincipal() {
        return professorPrincipal;
    }

    public void setProfessorPrincipal(Professor professorPrincipal) {
        this.professorPrincipal.getTurmas().removeIf((t) -> t.getNome().equals(this.nome));
        this.professorPrincipal = professorPrincipal;
        this.professorPrincipal.getTurmas().add(this);
    }

    public Professor getProfessorSubstituto() {
        return professorSubstituto;
    }

    public void setProfessorSubstituto(Professor professorSubstituto) {
        this.professorSubstituto = professorSubstituto;
    }

    public List<Aluno> getAlunosCadastrados() {
        return alunosCadastrados;
    }

    public void setAlunosCadastrados(List<Aluno> alunosCadastrados) {
        this.alunosCadastrados = alunosCadastrados;
    }

    public Aluno cadastrarAluno(Aluno aluno) {
        if (aluno.getTurma() != null || alunosCadastrados.size() == 30)
            return null;

        alunosCadastrados.add(aluno);
        aluno.setTurma(this);
        return aluno;
    }

}
