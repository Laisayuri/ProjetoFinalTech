package com.projetofinal.spring02.repository;

import java.util.List;

import com.projetofinal.spring02.model.Cliente;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepo extends CrudRepository<Cliente, Long> {
    public List<Cliente> findAllByOrderByNome();

    //consulta nativa no BD, diretamente em SQL
    @Query(value = "select * from tb_usuario where id = ?", nativeQuery = true)
    public Object buscaCliente(long id);
}