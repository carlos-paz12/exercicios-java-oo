package com.github.carlos_paz12.java_oo_exercicios.hospital.model;

public class Medico extends Funcionario {

    public Medico() {
        super();
    }

    public Medico(String registroProfissional, String nome, String email, String senha) {
        super(registroProfissional, nome, email, senha);
    }

    @Override
    public void fazerLogin() {
        System.out.println("Seja bem vindo, dr. " + nome);
    }

}
