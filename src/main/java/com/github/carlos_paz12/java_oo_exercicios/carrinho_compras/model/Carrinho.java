package com.github.carlos_paz12.java_oo_exercicios.carrinho_compras.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public void visualizarItens() {
        System.out.println("MEU CARRINHO ------------------------");
        System.out.println("ID\t\tITEM\t\tPREÇO");

        for (Item item : itens) {
            System.out.println(item.getId() + "\t\t" + item.getNome() + "\t\tR$" + item.getPreco());
        }
    }

    public Float calcularTotal() {
        Float total = 0f;

        for (Item item : itens) {
            total += item.getPreco();
        }

        return total;
    }

}
