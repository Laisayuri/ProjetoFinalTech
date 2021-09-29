package com.projetofinal.spring02.dto;

import com.projetofinal.spring02.model.Cliente;
import com.projetofinal.spring02.repository.ClienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteDto {
    
    @Autowired
    private ClienteRepo repoCliente;

    public Cliente novoCliente(Cliente clienteNovo){
        Cliente clienteInserido = repoCliente.save(clienteNovo);
        return clienteInserido;
    }
}
