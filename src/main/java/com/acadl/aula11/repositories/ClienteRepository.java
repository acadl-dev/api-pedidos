package com.acadl.aula11.repositories;

import com.acadl.aula11.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}


