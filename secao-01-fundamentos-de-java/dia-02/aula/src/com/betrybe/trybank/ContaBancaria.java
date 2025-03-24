package com.betrybe.trybank;

public class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = 0;
    }

    void mostraMessagem() {
        System.out.println("Conta acessada.");
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    double converterMoeda(float total, float cambio) {
        return total * cambio;
    }
}
