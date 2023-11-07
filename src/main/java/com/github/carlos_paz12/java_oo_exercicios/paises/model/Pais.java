package com.github.carlos_paz12.java_oo_exercicios.paises.model;

public class Pais {

    private String codigoISO;
    private String nome;
    private double populacao; /* em milhões de habitantes */
    private double dimensao; /* em km^2 */
    private Pais[] paisesVisinhos;

    public Pais() {

    }

    public Pais(String codigoISO, String nome, double populacao, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
        paisesVisinhos = new Pais[20];
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public Pais[] getPaisesVisinhos() {
        return paisesVisinhos;
    }

    public void setPaisesVisinhos(Pais[] paisesVisinhos) {
        this.paisesVisinhos = paisesVisinhos;
    }

    public boolean fazFronteira(Pais pais) {
        for (int i = 0; i < paisesVisinhos.length; i++) {

            if (paisesVisinhos[i].codigoISO.equalsIgnoreCase(pais.codigoISO)) {

                return true;

            }

        }

        return false;
    }

    public double calcularDensidadeDemografica() {
        double densidadeDemografica = populacao / dimensao;
        return densidadeDemografica;
    }

}
