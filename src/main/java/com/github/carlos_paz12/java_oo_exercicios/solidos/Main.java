package com.github.carlos_paz12.java_oo_exercicios.solidos;

import com.github.carlos_paz12.java_oo_exercicios.solidos.model.Cubo;
import com.github.carlos_paz12.java_oo_exercicios.solidos.model.Esfera;
import com.github.carlos_paz12.java_oo_exercicios.solidos.model.Piramide;

public class Main {

    public static void main(String[] args) {

        Piramide piramide = new Piramide(9, 6);
        Cubo cubo = new Cubo(12);
        Esfera esfera = new Esfera(12);

        System.out.println(piramide.calcularVolume());
        System.out.println(cubo.calcularVolume());
        System.out.println(esfera.calcularVolume());

    }

}
