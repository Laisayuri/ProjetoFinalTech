package com.projetofinal.spring02.controller;

import java.util.List;

import com.projetofinal.spring02.model.ContaBancaria;
import com.projetofinal.spring02.repository.ContaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Conta") // Qual o nome do recurso http://localhost:8080/projetofinal
@CrossOrigin("*")
public class ContaController {
    @Autowired // pede para implementar a classe e os métodos de acesso
    private ContaRepo repo;

    @GetMapping("/contas") //mostrar todas as contas
    public List<ContaBancaria> obterTodos() {
        return (List<ContaBancaria>) repo.findAll();
    }

    @GetMapping("/contas/{codigo}") //encontrar conta de acordo com {id}
    public ResponseEntity<ContaBancaria> ContaBancaria(@PathVariable long codigo) {
        ContaBancaria contaEncontrada = repo.findById(codigo).orElse(null);
        // procura um usuário cujo id = código do parâmetro.
        // se não encontrar coloca 'null' no usuário encontrado
        if(contaEncontrada !=null) {
            return ResponseEntity.ok(contaEncontrada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
