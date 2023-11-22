package com.github.carlos_paz12.java_oo_exercicios.rpg;

import com.github.carlos_paz12.java_oo_exercicios.rpg.model.Guerreiro;
import com.github.carlos_paz12.java_oo_exercicios.rpg.model.Mago;
import com.github.carlos_paz12.java_oo_exercicios.rpg.model.Partida;
import com.github.carlos_paz12.java_oo_exercicios.rpg.model.Personagem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Personagem conan = new Guerreiro("Conan", 7);
        Personagem vecna = new Mago("Vecna", 10);
        Personagem hermione = new Mago("Hermione", 2);

        Partida partida = new Partida(conan, vecna, hermione);

        while (partida.getPersonagens().size() > 1) {

            exibirPartida(partida);
            escolherOpcao(partida.getPersonagemDaVez(), partida);
            partida.avancarTurno();

        }

        System.out.println("Partida acabou! Personagem " + partida.getPersonagemDaVez().getNome() + " ganhou!!!");

    }

    public static void exibirPartida(Partida p) {

        System.out.println("Turno: " + p.getTurnos());

        for (Personagem ps : p.getPersonagens()) {
            System.out.print((p.getPersonagemDaVez() == ps ? "> " : "") + ps.getNome() + "\t\t");
        }

        System.out.println();

        for (Personagem ps : p.getPersonagens()) {
            System.out.print("HP: " + ps.getHp() + "\t\t");
        }

        System.out.println();

        for (Personagem ps : p.getPersonagens()) {
            System.out.print("MP: " + ps.getMp() + "\t\t");
        }

        System.out.println();

    }

    public static void escolherOpcao(Personagem p, Partida part) {

        System.out.println("\nVez de " + p.getNome());
        System.out.println("Selecione o alvo: ");

        Personagem alvo = null;
        Scanner sc = new Scanner(System.in);

        for (Personagem ps : part.getPersonagens()) {
            if (ps != p) {
                System.out.println("- " + ps.getNome());
            }
        }

        while (alvo == null) {
            System.out.print("\nInforme o nome: ");

            alvo = part.getPersonagemPorNome(sc.next());

            if (alvo == null) {
                System.out.println("Escolha um alvo v�lido.");
            }
        }

        System.out.println("Selecione a a��o: ");
        System.out.println("[1] Atacar");

        if (p instanceof Mago) {

            System.out.println("[2] Curar");

        } else {

            System.out.println("[2] N�o fazer nada");

        }

        int opcao = 0;

        while (opcao <= 0 || opcao > 2) {

            System.out.print("Informe a op��o: ");
            opcao = sc.nextInt();

            if (opcao <= 0 || opcao > 2) {

                System.out.println("Informe uma op��o v�lida.");

            }
        }

        if (opcao == 1) {

            if (p.atacar(alvo)) {

                System.out.println("Ataque bem sucedido!!!");

                if (alvo.isMorto()) {

                    System.out.println("Personagem " + alvo.getNome() + " morreu =/");

                }

            } else {

                System.out.println("Ataque falhou =/");

            }

        } else if (p instanceof Mago) {

            Mago mago = (Mago) p;
            mago.usarMagiaDeCura(p);

            System.out.println(p.getNome() + " se curou!!!");

        }

    }

}
