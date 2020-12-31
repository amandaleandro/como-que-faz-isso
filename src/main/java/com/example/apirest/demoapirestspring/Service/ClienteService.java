package com.example.apirest.demoapirestspring.Service;

import com.example.apirest.demoapirestspring.repository.ClienteRepository;
import com.example.apirest.demoapirestspring.model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
