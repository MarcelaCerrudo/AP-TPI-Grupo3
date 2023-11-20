package com.comsion144.g3.tpiapspring.repository;

import com.comsion144.g3.tpiapspring.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
