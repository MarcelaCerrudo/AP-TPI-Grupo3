package com.comsion144.g3.tpiapspring.repository.tecnico.TecnicoRepository;

import com.comsion144.g3.tpiapspring.entity.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
}
