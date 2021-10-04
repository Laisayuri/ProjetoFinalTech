package com.projetofinal.spring02.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // esta classe será mapeada no Banco de Dados
@Table(name = "tb_cliente")
public class Cliente {

     @Id // será chave primária
     // o BD gera este código automaticamente, em sequencia: 1, 2, 3, ...
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "codigo")
     private long codigo;

     @Column(name = "nome", length = 200, nullable = false)
     private String nome;

     @Column(name = "cpf", length = 12, nullable = false, unique = true)
     private String cpf;

     @Column(name = "telefone", length = 15, nullable = false)
     private String telefone;

     @Column(name = "email", length = 50, nullable = false, unique = true)
     private String email;

     // Um cliente pode ter várias contas
    @OneToMany(mappedBy = "titular")
    @JsonIgnoreProperties("titular") 
    private List<ContaBancaria> contas;

     public Cliente(){
          
     }

     public Cliente(String nome, String cpf, String telefone, String email) {
          this.nome = nome;
          this.cpf = cpf;
          this.telefone = telefone;
          this. email = email;
     }

     public long getCodigo() {
          return codigo;
     }

     public void setCodigo(long codigo) {
          this.codigo = codigo;
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getCpf() {
          return cpf;
     }

     public void setCpf(String cpf) {
          this.cpf = cpf;
     }

     public String getTelefone() {
          return telefone;
     }

     public void setTelefone(String telefone) {
          this.telefone = telefone;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public List<ContaBancaria> getContas() {
          return contas;
      }
  
      public void setContas(List<ContaBancaria> contas) {
          this.contas = contas;
      }
          
}
