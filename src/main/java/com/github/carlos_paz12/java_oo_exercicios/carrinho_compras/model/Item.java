package com.github.carlos_paz12.java_oo_exercicios.carrinho_compras.model;

import java.util.Random;

public class Item {

    private Long id;
    private String nome;
    private Float preco;

    public Item() {
        this.id = (long) new Random().nextInt(1000);
    }

    public Item(String nome, Float preco) {
        this.id = (long) new Random().nextInt(1000);
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

}
