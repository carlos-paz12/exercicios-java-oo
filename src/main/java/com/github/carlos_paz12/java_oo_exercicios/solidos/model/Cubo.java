package com.github.carlos_paz12.java_oo_exercicios.solidos.model;

public class Cubo implements SolidoGeometrico {

    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(aresta, 3);
    }

}
