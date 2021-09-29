package com.projetofinal.spring02.controller;

import java.util.List;

import com.projetofinal.spring02.dto.ContaBancariaDto;
import com.projetofinal.spring02.model.ContaBancaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta") // Qual o nome do recurso http://localhost:8080/projetofinal
@CrossOrigin("*")
public class ContaController {
    @Autowired // pede para implementar a classe e os métodos de acesso
    private ContaBancariaDto dtoContaBancaria;

    @GetMapping("/contas") //mostrar todas as contas
    public List<ContaBancaria> obterTodasContas() {
        return dtoContaBancaria.listarTodasContas();
    }

    @GetMapping("/contas/{codigo}") //encontrar conta de acordo com {codigo}
    public ResponseEntity<ContaBancaria> buscarCodigo(@PathVariable long codigo) {
        ContaBancaria contaEncontrada = dtoContaBancaria.buscarContaPorCodigo(codigo);
        // procura uma conta cujo id = código do parâmetro.
        // se não encontrar coloca 'null' na conta encontrada
        if(contaEncontrada !=null) {
            return ResponseEntity.ok(contaEncontrada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
