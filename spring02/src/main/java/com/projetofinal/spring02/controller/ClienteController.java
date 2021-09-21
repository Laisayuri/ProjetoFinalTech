package com.projetofinal.spring02.controller;

public class AppCliente {

    package com.itau.spring02.controller.AppCliente

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ALT + SHIFT + O --> atalho arrumar import

@RestController
@RequestMapping("/Cliente") // Qual o nome do recurso http://localhost:8080/projetofinal
public class AppCliente {
 
    @GetMapping("/sample") 
    public String getCliente() {
        return "Cliente";
    }
    @GetMapping("/id/{codigo}")
    public ResponseEntity<Usuario>AppCliente(@PathVariable long codigo) {
        Cliente clienteencontrado = repo.findBuId(codigo).orElse(null);

        if(clienteencontrado !=null) {
            return ResponseEntity.ok(clienteencontrado);
        } else {
            return ResponseEntity.notFound().build;
    }
    @GetMapping("/codigo/{id}")
    public Object buscarPorId(@PathVariable long id) {
        return repo.buscaUsuario(id);
    }
    
}
