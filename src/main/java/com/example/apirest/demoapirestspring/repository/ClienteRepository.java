package com.example.apirest.demoapirestspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.apirest.demoapirestspring.model.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findById( long id);
    
}
