package com.projetofinal.spring02.repository;

import com.projetofinal.spring02.model.ContaBancaria;

import org.springframework.data.repository.CrudRepository;

public interface ContaRepo extends CrudRepository<ContaBancaria, Long>{
    public ContaBancaria findByContaBancaria(int numero, int agencia, double saldo, String titular, int tipoConta);
    
} 