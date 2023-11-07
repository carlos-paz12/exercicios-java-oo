package com.github.carlos_paz12.java_oo_exercicios.paises;

import com.github.carlos_paz12.java_oo_exercicios.paises.model.Pais;

public class Main {

    public static void main(String[] args) {

        Pais bra = new Pais("BRA", "Brasil", 214.3, 8510000);
        Pais arg = new Pais("ARG", "Argentina", 45.81, 2780000);
        Pais col = new Pais("COL", "Colômbia", 51.52, 1142000);
        Pais per = new Pais("PER", "Peru", 33.72, 1285000);
        Pais chl = new Pais("CHL", "Chile", 19.49, 756626);
        Pais ven = new Pais("VEN", "Venezuela", 28.2, 916445);
        Pais ecu = new Pais("ECU", "Equador", 17.8, 256370);
        Pais bol = new Pais("BOL", "Bolívia", 12.08, 1099000);
        Pais ury = new Pais("URY", "Uruguai", 3., 176215);
        Pais guy = new Pais("GUY", "Guiana", 0.804567, 214969);
        Pais pry = new Pais("PRY", "Paraguai", 6.704, 406752);
        Pais sur = new Pais("SUR", "Suriname", 0.612985, 163820);
        Pais gf = new Pais("GF", "Guiana Francesa", 0.294071, 83846);

        Pais[] paisesVizinhosBra = { arg, col, per, ven, bol, ury, guy, pry, sur, gf };
        bra.setPaisesVisinhos(paisesVizinhosBra);

        System.out.println(bra.fazFronteira(arg));
        System.out.println(bra.fazFronteira(chl));
        System.out.println(bra.fazFronteira(guy));
        System.out.println(bra.fazFronteira(ecu));

    }

}
