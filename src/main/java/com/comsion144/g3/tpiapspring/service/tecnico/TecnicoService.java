package com.comsion144.g3.tpiapspring.service.tecnico;

import com.comsion144.g3.tpiapspring.entity.Tecnico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TecnicoService {
    Tecnico saveTecnico(Tecnico tecnico);
    List<Tecnico> getAllTecnico();
    Tecnico updateTecnico (Tecnico tecnico, Long id);
    void deleteTecnicoById(Long id);
}
