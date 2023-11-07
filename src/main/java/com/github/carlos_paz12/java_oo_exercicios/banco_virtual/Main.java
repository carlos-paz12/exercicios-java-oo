package com.github.carlos_paz12.java_oo_exercicios.banco_virtual;

import com.github.carlos_paz12.java_oo_exercicios.banco_virtual.model.Conta;

public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta("123.456.789-00", "123456", 1);
        Conta conta2 = new Conta("987.654.321-00", "654321", 1);

        conta1.consultarDados();
        conta2.consultarDados();

        conta1.consultarSaldo();
        conta2.consultarSaldo();

        conta1.depositar(500f);
        conta2.depositar(400f);

        conta1.consultarSaldo();
        conta2.consultarSaldo();

        conta1.sacar(400f);
        conta2.sacar(100f);

        conta1.consultarSaldo();
        conta2.consultarSaldo();

        conta1.transferir(conta2, 50);

        conta1.consultarSaldo();
        conta2.consultarSaldo();

        conta1.guardarNoCofrinho(40);

        conta1.consultarSaldo();

        conta1.retirarDoCofrinho(30, "123456");

        conta1.consultarSaldo();

    }

}
