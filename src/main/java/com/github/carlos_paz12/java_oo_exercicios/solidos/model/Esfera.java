package com.github.carlos_paz12.java_oo_exercicios.solidos.model;

public class Esfera implements SolidoGeometrico {

    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return (4 * 3 * Math.pow(raio, 3) / 3);
    }

}
