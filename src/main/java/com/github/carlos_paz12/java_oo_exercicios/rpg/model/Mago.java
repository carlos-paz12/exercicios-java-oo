package com.github.carlos_paz12.java_oo_exercicios.rpg.model;

public class Mago extends Personagem {
    
    public Mago(String nome, int forca) {
        super(nome, forca);
    }
    
    public void usarMagiaDeCura(Personagem p) {
        p.hp += forca;
    }
    
}
