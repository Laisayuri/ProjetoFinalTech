package com.projetofinal.spring02.controller;

import com.projetofinal.spring02.dto.ClienteDto;
import com.projetofinal.spring02.model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// ALT + SHIFT + O --> atalho arrumar import
@RestController
@RequestMapping("/cliente") // Qual o nome do recurso http://localhost:8080/projetofinal
@CrossOrigin("*")
public class ClienteController {

    @Autowired // pede para implementar a classe e os métodos de acesso
    private ClienteDto dtoCliente;
  
    @PostMapping("/novo") //cadastrar novos clientes
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente) {
        Cliente clienteInserido = dtoCliente.novoCliente(cliente);
        return ResponseEntity.ok(clienteInserido);
    }
       
}
