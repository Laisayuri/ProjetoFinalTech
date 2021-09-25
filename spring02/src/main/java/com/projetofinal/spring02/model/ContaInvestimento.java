package com.projetofinal.spring02.model;

public class ContaInvestimento {

    private double limite;

    public ContaInvestimento(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(getSaldo() + limite >= valor) {
            return super.sacar(valor);
        }
        return false;
    }
    
    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }
    
}
