package com.github.carlos_paz12.java_oo_exercicios.media.model;

public class Aluno {

    private String matricula;
    private double[] notas = new double[4];

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void inserirNota(int etapa, double nota) {
        if (etapa >= 0 && etapa <= 3 && nota >= 0 && nota <= 10) {
            notas[etapa] = nota;
        }
    }

    public double calcMedia() {
        double media = 0.0;

        for (int i = 0; i < notas.length; i++) {
            if (i == 0 || i == 1) {
                media = media + notas[i] * 2;
            } else {
                media = media + notas[i] * 3;
            }
        }

        media = media / 10;
        return media;
    }

}
