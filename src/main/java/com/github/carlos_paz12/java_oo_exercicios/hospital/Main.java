package com.github.carlos_paz12.java_oo_exercicios.hospital;

import com.github.carlos_paz12.java_oo_exercicios.hospital.model.Enfermeira;
import com.github.carlos_paz12.java_oo_exercicios.hospital.model.Medico;

public class Main {

    public static void main(String[] args) {

        Medico medico = new Medico("222446", "Carlos", "carlos@email.com", "123456");
        Enfermeira enfermeira = new Enfermeira("589413", "Poliana", "poliana@email.com", "654321");

        medico.fazerLogin();
        enfermeira.fazerLogin();

    }

}
