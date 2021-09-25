package com.projetofinal.spring02.model;

public class ContaPoupanca extends ContaBancaria {
    private static double taxa = 0.1; // static = atributo da classe, não de cada objeto

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static double getTaxa() {
        return taxa;
    }

    public static void setTaxa(double taxa) {
        if(taxa >= 0 && taxa < 1) {
            ContaPoupanca.taxa = taxa;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if(getSaldo() >= valor + taxa) {
            return super.sacar(valor + taxa);
        }
        return false;
    }
    
}
