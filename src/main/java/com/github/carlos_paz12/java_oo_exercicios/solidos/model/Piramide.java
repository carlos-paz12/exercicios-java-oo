package com.github.carlos_paz12.java_oo_exercicios.solidos.model;

public class Piramide implements SolidoGeometrico {

    private double areaBase;
    private double altura;

    public Piramide(double areaBase, double altura) {
        this.areaBase = areaBase;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return (areaBase * altura) / 3;
    }

}
