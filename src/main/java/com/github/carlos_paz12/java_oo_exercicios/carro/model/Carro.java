package com.github.carlos_paz12.java_oo_exercicios.carro.model;

public class Carro {

    private double autonomia;
    private double qtdCombustivel;
    private double capTanque;
    private boolean ligado;

    public Carro(double autonomia, double capTanque) {
        this.autonomia = autonomia;
        this.capTanque = capTanque;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void abastecer(double combustivel) {
        if (combustivel > 0)
            if (qtdCombustivel == capTanque) {

                System.out.println("Tanque cheio");

            } else if (qtdCombustivel + combustivel > capTanque) {

                System.out.println("O tanque foi completado");
                qtdCombustivel = capTanque;

            } else {

                System.out.println("Você abasteceu " + combustivel + " litros");
                qtdCombustivel += combustivel;

            }
    }

    public void viajar(double distancia) {
        double combustivelNecessario = distancia / autonomia;

        if (qtdCombustivel >= combustivelNecessario) {

            if (ligado) {

                System.out.println("A caminho...");

            } else {

                System.out.println("Ligue o carro primeiro");

            }

        } else {

            System.out.println("Você precisará abastecer");

        }
    }

}
