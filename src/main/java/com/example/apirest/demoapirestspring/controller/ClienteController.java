package com.example.apirest.demoapirestspring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.apirest.demoapirestspring.model.Cliente;
import com.example.apirest.demoapirestspring.repository.ClienteRepository;


@RestController
@RequestMapping("/api")

public class ClienteController{
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Cliente> listar () {
        return clienteRepository.findAll();
        
    }
    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
    @GetMapping("/cliente/{id}")
    public Cliente listarumcliente (@PathVariable(value= "id")long id) {
        return clienteRepository.findById(id);  
    }

}
