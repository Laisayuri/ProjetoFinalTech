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

    // @PostMapping("/nova")//cadastrar novas contas
    // public ResponseEntity<ContaBancaria> criarConta(@RequestBody ContaBancaria conta) {
    //     ContaBancaria contaInserida = dtoContaBancaria.novaContaBancaria(conta);
    //     return ResponseEntity.ok(contaInserida);
    // }
    
    //endopoints
    @GetMapping("/contas") //mostrar todas as contas
    public List<ContaBancaria> obterTodasContas() {
        return dtoContaBancaria.listarTodasContas();
    }

    @GetMapping("/{numero}") //encontrar conta de acordo com {numero}
    public ResponseEntity<ContaBancaria> getByNumero(@PathVariable long numero) {
        ContaBancaria contaEncontrada = dtoContaBancaria.buscarContaPorCodigo(numero);
        
        if(contaEncontrada !=null) {
            return ResponseEntity.ok(contaEncontrada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
