package com.example.apirest.demoapirestspring.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Date;

@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Date dataNascimento;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String email;

    public Long getId() {
        return id;
    }
    public void SetId(Long id){
        this.id = id;
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
    public Date getDataNascimento() {
    return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime  * result + ((id == null)? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals( Object obj) {

        if(this == obj)
        return true;
        if(obj == null)
        return false;
        Cliente other = (Cliente) obj;
        if(id == null){
            if(other.id != null)
            return false;
        }else if (!id.equals(other.id))
        return false;
        return true;
    }
}