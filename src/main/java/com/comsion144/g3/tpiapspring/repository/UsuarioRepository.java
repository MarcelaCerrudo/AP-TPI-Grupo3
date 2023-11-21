package com.comsion144.g3.tpiapspring.repository;

import com.comsion144.g3.tpiapspring.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
