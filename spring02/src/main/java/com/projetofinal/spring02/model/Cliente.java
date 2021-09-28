package com.projetofinal.spring02.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
     private int cpf;

     @Column(name = "telefone", length = 15, nullable = false)
     private String telefone;

     @Column(name = "email", length = 50, nullable = false, unique = true)
     private String email;



     public Cliente(String nome, int cpf, String telefone, String email) {
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

     public int getCpf() {
          return cpf;
     }

     public void setCpf(int cpf) {
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
          
}
