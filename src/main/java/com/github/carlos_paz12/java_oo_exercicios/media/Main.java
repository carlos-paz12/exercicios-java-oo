package com.github.carlos_paz12.java_oo_exercicios.media;

import com.github.carlos_paz12.java_oo_exercicios.media.model.Aluno;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("20201114010055");

        aluno.inserirNota(0, 10);
        aluno.inserirNota(1, 10);
        aluno.inserirNota(2, 10);
        aluno.inserirNota(3, 6);

        System.out.println(aluno.calcMedia());
    }

}
