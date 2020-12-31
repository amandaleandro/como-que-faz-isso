package com.example.apirest.demoapirestspring.model.Dto;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

import org.hibernate.validator.constraints.br.CPF;
@Getter
@Setter
public class ClienteDto {
    @NotEmpty
    private String nome;

    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotEmpty
    private Date dataNascimento;

    @CPF
    @NotEmpty(message = "CPF Invalido")
    private String cpf;

    @Email
    @NotEmpty(message = "Email invalido")
    private String email;
}
