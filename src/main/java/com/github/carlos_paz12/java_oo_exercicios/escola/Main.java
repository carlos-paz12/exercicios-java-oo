package com.github.carlos_paz12.java_oo_exercicios.escola;

import com.github.carlos_paz12.java_oo_exercicios.escola.model.Aluno;
import com.github.carlos_paz12.java_oo_exercicios.escola.model.Professor;
import com.github.carlos_paz12.java_oo_exercicios.escola.model.Turma;

public class Main {

    public static void main(String[] args) {

        Professor fernando = new Professor();
        fernando.setNome("Fernando");
        fernando.setMatricula("123456");

        Professor daniel = new Professor();
        daniel.setNome("Daniel");
        daniel.setMatricula("654321");

        Turma info4m = new Turma(daniel);
        info4m.setNome("INFO 4M");
        info4m.setTurno("Matutino");
        info4m.setProfessorSubstituto(fernando);

        Turma info4v = new Turma(fernando);
        info4v.setNome("INFO 4V");
        info4v.setTurno("Vespertino");
        info4v.setProfessorSubstituto(daniel);

        System.out.println(daniel.getTurmas().get(0).getNome());
        System.out.println(fernando.getTurmas().get(0).getNome());

        for (int i = 0; i < 35; i++) {
            Aluno alunoTemp = new Aluno();
            alunoTemp.setMatricula("202011140100" + i);
            alunoTemp.setNome("Aluno " + i);

            Aluno response = info4m.cadastrarAluno(alunoTemp);
            System.out.println(response != null);
        }

    }

}
