package com.github.carlos_paz12.java_oo_exercicios.agenda_contatos.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public Agenda(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionatContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {

            if (contato.getNome().equalsIgnoreCase(nome)) {

                return contato;

            }

        }

        return null;
    }

    public Contato buscarContatoPorEmail(String email) {
        for (Contato contato : contatos) {

            if (contato.getEmail().equals(email)) {

                return contato;

            }

        }

        return null;
    }

    public Contato buscarContatoPorNumero(String numero) {
        for (Contato contato : contatos) {

            if (contato.getNumero().equals(numero)) {

                return contato;

            }

        }

        return null;
    }

}
