package com.projetofinal.spring02.dto;

import java.util.List;

import com.projetofinal.spring02.model.ContaBancaria;
import com.projetofinal.spring02.repository.ContaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaBancariaDto {
    
    @Autowired
    private ContaRepo repoConta;

    // public ContaBancaria novaContaBancaria(ContaBancaria contaNova){
    //     ContaBancaria contaInserida = repoConta.save(contaNova);
    //     return contaInserida;
    // }

    public List<ContaBancaria> listarTodasContas() {
        List<ContaBancaria> lista = (List<ContaBancaria>) repoConta.findAll();
        return lista;
    }

    public ContaBancaria buscarContaPorCodigo(long contaNumero){
        ContaBancaria contaBancaria = repoConta.findById(contaNumero).orElse(null);
        return contaBancaria;
    }
}
