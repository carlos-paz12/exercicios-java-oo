package com.github.carlos_paz12.java_oo_exercicios.classes_rpg;

import com.github.carlos_paz12.java_oo_exercicios.classes_rpg.Model.Anao;
import com.github.carlos_paz12.java_oo_exercicios.classes_rpg.Model.Barbaro;
import com.github.carlos_paz12.java_oo_exercicios.classes_rpg.Model.Classe;
import com.github.carlos_paz12.java_oo_exercicios.classes_rpg.Model.Mago;

public class Main {

    public static void main(String[] args) {
        Anao anao = new Anao();
        Barbaro barbaro = new Barbaro();
        Mago mago = new Mago();

        lutar(anao);
        lutar(barbaro);
        lutar(mago);
    }

    public static void lutar(Classe classe) {
        System.out.println(classe.atacar());
        System.out.println(classe.defender());
        System.out.println(classe.provocar());
    }

}