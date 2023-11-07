package com.github.carlos_paz12.java_oo_exercicios.banco_virtual.model;

import java.util.Random;

public class Conta {

    private String cpfTitular;
    private String senha;
    private String numeroConta;
    private int tipoConta;
    private float saldo;
    private float cofrinho;

    public Conta(String cpfTitular, String senha, int tipoConta) {
        this.cpfTitular = cpfTitular;
        this.senha = senha;
        this.tipoConta = tipoConta;
        gerarNumeroConta();
    }

    private void gerarNumeroConta() {
        long numeroContTemp = new Random().nextLong(999999) + 1;
        numeroConta = String.valueOf(numeroContTemp) + tipoConta;
    }

    public void consultarDados() {
        System.out.println("MEUS DADOS");
        System.out.println("CPF: " + cpfTitular);
        System.out.println("NÚMERO: " + numeroConta);
        System.out.println("TIPO DA CONTA: " + (tipoConta == 1 ? "Corrente" : "Poupança"));
    }

    public void consultarSaldo() {
        System.out.println("SEU SALDO É DE:");
        System.out.println("R$" + saldo);
    }

    public void depositar(float valorDeposito) {
        if (valorDeposito <= 0) {

            System.out.println("Não é possível depositar valor menor ou igual a zero");

        } else {

            saldo += valorDeposito;

        }
    }

    public float sacar(float valorSaque) {
        if (valorSaque <= 0) {

            System.out.println("Não é possível sacar valor menor ou igual a zero");
            return 0;

        } else if (valorSaque > saldo) {

            System.out.println("Não é possível sacar valor maior que saldo");
            return 0;

        } else {

            saldo -= valorSaque;
            return valorSaque;

        }
    }

    public void transferir(Conta contaDestino, float valorTransferencia) {
        float taxaTransferencia = 0f;

        if (tipoConta == 1 && contaDestino.tipoConta == 1) {

            taxaTransferencia = 1.75f / 100 * valorTransferencia;

        } else if (tipoConta != contaDestino.tipoConta) {

            taxaTransferencia = 1.47f / 100 * valorTransferencia;

        }

        float totalTransferencia = valorTransferencia + taxaTransferencia;

        if (totalTransferencia > saldo) {

            System.out.println("Não foi possível realizar a operação devido a taxa aplicada sob a transferência");

        } else {

            contaDestino.depositar(valorTransferencia);
            saldo -= totalTransferencia;

        }
    }

    public void guardarNoCofrinho(float valor) {
        if (valor <= 0) {

            System.out.println("Não é possível guardar valor menor ou igual a zero");

        } else if (valor > saldo) {

            System.out.println("Não é possível guardar valor maior que saldo");

        } else {

            cofrinho += valor;
            saldo -= valor;

        }
    }

    public void retirarDoCofrinho(float valor, String senha) {
        if (valor <= 0) {

            System.out.println("Não é possível retirar valor menor ou igual a zero");

        } else if (valor > cofrinho) {

            System.out.println("Não é possível retirar valor maior que saldo");

        } else if (!senha.equals(this.senha)) {

            System.out.println("Senha incorreta");

        } else {

            cofrinho -= valor;
            saldo += valor;

        }
    }

}
