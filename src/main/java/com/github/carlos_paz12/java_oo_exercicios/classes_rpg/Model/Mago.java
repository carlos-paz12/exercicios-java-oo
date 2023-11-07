package com.github.carlos_paz12.java_oo_exercicios.classes_rpg.Model;

public class Mago implements Classe {

    @Override
    public String atacar() {
        return "Mago atacando...";
    }

    @Override
    public String defender() {
        return "Mago defendendo...";
    }

    @Override
    public String provocar() {
        return "Mago provocando...";
    }

}
