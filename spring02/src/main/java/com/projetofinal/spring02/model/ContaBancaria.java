package com.projetofinal.spring02.model;
    public class ContaBancaria {

        private int numero;
        private int agencia;
        private double saldo;
        private String titular;
        private int tipoConta;

        public ContaBancaria(int numero, int agencia, double saldo, String titular, int tipoConta) {

        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
        this.tipoConta = tipoConta;

        }

    }

public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
}
