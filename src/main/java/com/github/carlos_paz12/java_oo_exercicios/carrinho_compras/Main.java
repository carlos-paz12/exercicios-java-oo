package com.github.carlos_paz12.java_oo_exercicios.carrinho_compras;

import com.github.carlos_paz12.java_oo_exercicios.carrinho_compras.model.Carrinho;
import com.github.carlos_paz12.java_oo_exercicios.carrinho_compras.model.Item;

public class Main {

    public static void main(String[] args) {

        Carrinho meuCarrinho = new Carrinho();
        Item feijao = new Item("Feijão", 5.0f);
        Item arroz = new Item("Arroz", 5.5f);
        Item negresco = new Item("Negres", 3.0f);
        Item oreo = new Item("Oreo", 4.5f);

        meuCarrinho.adicionarItem(feijao);
        meuCarrinho.adicionarItem(arroz);
        meuCarrinho.adicionarItem(negresco);
        meuCarrinho.adicionarItem(oreo);

        meuCarrinho.visualizarItens();

        System.out.println("Total R$" + meuCarrinho.calcularTotal());

        meuCarrinho.removerItem(arroz);
        meuCarrinho.removerItem(oreo);

        meuCarrinho.visualizarItens();
        System.out.println("Total R$" + meuCarrinho.calcularTotal());

    }

}