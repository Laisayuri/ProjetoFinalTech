package com.projetofinal.spring02.controller;

import com.projetofinal.spring02.model.Cliente;
import com.projetofinal.spring02.repository.ClienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// ALT + SHIFT + O --> atalho arrumar import
@RestController
@RequestMapping("/Cliente") // Qual o nome do recurso http://localhost:8080/projetofinal
@CrossOrigin("*")
public class ClienteController {

    @Autowired // pede para implementar a classe e os métodos de acesso
    private ClienteRepo repo;
    

    @GetMapping("/id/{codigo}")
    public ResponseEntity<Cliente> Cliente(@PathVariable long codigo) {
        Cliente clienteEncontrado = repo.findById(codigo).orElse(null);
        // procura um usuário cujo id = código do parâmetro.
        // se não encontrar coloca 'null' no usuário encontrado
        if(clienteEncontrado !=null) {
            return ResponseEntity.ok(clienteEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/novo") //cadastrar novos clientes
    // os dados virão no Body = corpo da requisição
    public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente Cliente) {
        if(Cliente.getCodigo() != 0) {
            return ResponseEntity.status(400).build(); // não pode ter id
        }
        Cliente novoCliente = repo.save(Cliente);
        return ResponseEntity.status(201).body(novoCliente); // 201 = criado com sucesso
    }
    
    @GetMapping("/codigo/{id}")
    public Object buscarPorId(@PathVariable long id) {
        return repo.buscaCliente(id);
    }
    
}
