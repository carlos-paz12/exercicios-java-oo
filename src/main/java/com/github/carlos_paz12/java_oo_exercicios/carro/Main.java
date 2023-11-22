package com.github.carlos_paz12.java_oo_exercicios.carro;

import com.github.carlos_paz12.java_oo_exercicios.carro.model.Carro;

public class Main {

    public static void main(String[] args) {

        Carro fusca = new Carro(9.8, 40);
        Carro ferrari = new Carro(8.4, 80);

        fusca.abastecer(10);
        ferrari.abastecer(40);

        fusca.setLigado(true);
        ferrari.setLigado(true);

        fusca.viajar(100);
        ferrari.viajar(288);

    }

}
