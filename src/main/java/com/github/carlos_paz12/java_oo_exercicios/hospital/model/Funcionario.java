package com.github.carlos_paz12.java_oo_exercicios.hospital.model;

public abstract class Funcionario extends Usuario {

    protected String registroProfissional;

    public Funcionario() {
        super();
    }

    public Funcionario(String registroProfissional, String nome, String email, String senha) {
        super(nome, email, senha);
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
