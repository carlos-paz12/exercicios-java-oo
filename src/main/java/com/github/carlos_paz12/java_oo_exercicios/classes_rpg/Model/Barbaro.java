package com.github.carlos_paz12.java_oo_exercicios.classes_rpg.Model;

public class Barbaro implements Classe {

    @Override
    public String atacar() {
        return "Bárbaro atacando...";
    }

    @Override
    public String defender() {
        return "Bárbaro defendendo...";
    }

    @Override
    public String provocar() {
        return "Bárbaro provocando...";
    }

}
