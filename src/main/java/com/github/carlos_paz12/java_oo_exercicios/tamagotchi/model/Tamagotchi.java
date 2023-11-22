package com.github.carlos_paz12.java_oo_exercicios.tamagotchi.model;

public class Tamagotchi {
    private String nome;
    private int nivelFome;
    private int nivelSono;
    private int nivelSaude;
    private boolean morto;

    public Tamagotchi(String nome) {
        this.nome = nome;
        this.nivelSaude = 70;
        this.nivelFome = 20;
        this.nivelSono = 10;
        this.morto = false;
    }

    private void verificarStatus() {
        if (nivelFome >= 100 || nivelSono >= 100 || nivelSaude <= 0) {
            morto = true;
            System.out.println(nome + " morreu!");
        }
    }

    public void alimentar() {
        if (!morto) {
            nivelFome = Math.max(0, nivelFome - 1);
            nivelSono = Math.min(100, nivelSono + 1);

            if (nivelFome == 0) {
                nivelSaude = Math.max(0, nivelSaude - 2);
            }

            verificarStatus();
        } else {
            System.out.println(nome + " está morto e não pode ser alimentado.");
        }
    }

    public void brincar() {
        if (!morto) {
            if (nivelSaude > 0) {
                nivelFome = Math.min(100, nivelFome + 2);
                nivelSono = Math.min(100, nivelSono + 2);
                nivelSaude = Math.min(100, nivelSaude + 2);
            } else {
                System.out.println(nome + " está muito doente para brincar.");
            }

            verificarStatus();
        } else {
            System.out.println(nome + " está morto e não pode brincar.");
        }
    }

    public void medicar() {
        if (!morto) {
            nivelSaude = Math.min(100, nivelSaude + 1);
            nivelFome = Math.min(100, nivelFome + 1);

            if (nivelSaude == 100) {
                nivelSaude = Math.max(0, nivelSaude - 2);
            }

            verificarStatus();
        } else {
            System.out.println(nome + " está morto e não pode ser medicado.");
        }
    }

    public void dormir() {
        if (!morto) {
            nivelSono = Math.max(0, nivelSono - 2);
            nivelSaude = Math.min(100, nivelSaude + 2);

            if (nivelSono == 0) {
                nivelFome = Math.min(100, nivelFome + 2);
            }

            verificarStatus();
        } else {
            System.out.println(nome + " está morto e não pode dormir.");
        }
    }

}
