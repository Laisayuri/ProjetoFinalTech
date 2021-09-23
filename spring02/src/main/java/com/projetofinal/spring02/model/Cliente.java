package com.projetofinal.spring02.model;

public class Cliente {
       private int codigo;
       private String nome;
       private int cpf;
       private String telefone;
       private String email;

     public Cliente(int codigo, String nome, int cpf, String telefone, String email) {
          this.codigo = codigo;
          this.nome = nome;
          this.cpf = cpf;
          this.telefone = telefone;
          this. email = email;
     }

     public int getCodigo() {
          return codigo;
     }

     public void setCodigo(int codigo) {
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
