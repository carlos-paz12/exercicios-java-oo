package com.github.carlos_paz12.java_oo_exercicios.tamagotchi;

import com.github.carlos_paz12.java_oo_exercicios.tamagotchi.model.Tamagotchi;

public class Main {

    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi("Pou");

        tamagotchi.alimentar();
        tamagotchi.brincar();
        tamagotchi.medicar();
        tamagotchi.dormir();
    }

}
