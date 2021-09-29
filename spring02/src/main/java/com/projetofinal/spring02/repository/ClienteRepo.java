package com.projetofinal.spring02.repository;

import com.projetofinal.spring02.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepo extends CrudRepository<Cliente, Long> {
 
}