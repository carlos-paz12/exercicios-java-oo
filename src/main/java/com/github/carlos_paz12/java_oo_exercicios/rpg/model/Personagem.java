package com.github.carlos_paz12.java_oo_exercicios.rpg.model;

public abstract class Personagem {

    protected String nome;
    protected int hp, mp;
    protected int forca, resistencia;

    public Personagem(String nome, int forca) {
        this.nome = nome;
        if (forca >= 10) {
            this.forca = 10;
            this.resistencia = 0;
        } else {
            this.forca = forca;
            this.resistencia = 10 - forca;
        }
        hp = mp = 50;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public boolean atacar(Personagem p) {
        int dado = (int) (Math.random() * 21);
        if (dado >= 5) {
            return !p.defender(this);
        }
        return false;
    }

    public boolean defender(Personagem p) {
        int dado = (int) (Math.random() * 21);
        if (dado <= 20 - resistencia / 2) {
            hp -= p.forca;
            return false;
        }
        return true;
    }

    public boolean isMorto() {
        return hp <= 0;
    }

}
