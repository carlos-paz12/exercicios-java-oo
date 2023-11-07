package com.github.carlos_paz12.java_oo_exercicios.agenda_contatos;

import com.github.carlos_paz12.java_oo_exercicios.agenda_contatos.model.Agenda;
import com.github.carlos_paz12.java_oo_exercicios.agenda_contatos.model.Contato;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Contato carlos = new Contato("Carlos", "carlos@gmail.com", "84988887777");
        Contato rafael = new Contato("Rafael", "rafael@gmail.com", "83977778888");
        Contato carla = new Contato("Carla", "carla@gmail.com", "83966665555");

        Agenda agenda = new Agenda(Arrays.asList(carlos, rafael, carla));

        Contato c1 = agenda.buscarContatoPorNome("carlos");
        Contato c2 = agenda.buscarContatoPorEmail("rafael@gmail.com");
        Contato c3 = agenda.buscarContatoPorNumero("83966665555");

        System.out.println(c1.getEmail());
        System.out.println(c2.getNumero());
        System.out.println(c3.getNome());

    }

}
