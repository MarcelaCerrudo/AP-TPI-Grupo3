package com.comsion144.g3.tpiapspring.service.tecnico;

import com.comsion144.g3.tpiapspring.entity.Tecnico;
import com.comsion144.g3.tpiapspring.repository.tecnico.TecnicoRepository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TecnicoServiceImpl implements TecnicoService {
    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Override
    public Tecnico saveTecnico(Tecnico tecnico) {
        return tecnicoRepository.save(tecnico);
    }

    @Override
    public List<Tecnico> getAllTecnico() {
        return tecnicoRepository.findAll();
    }

    @Override
    public Tecnico updateTecnico(Tecnico tecnico, Long id) {
        Tecnico tecnicoDB = tecnicoRepository.findById(id).get();
        if(!tecnico.getNombre().trim().isEmpty())
            tecnicoDB.setNombre(tecnico.getNombre());
        if(!tecnico.getMail().trim().isEmpty())
            tecnicoDB.setMail(tecnico.getMail());
        if(!tecnico.getTelefono().trim().isEmpty())
            tecnicoDB.setTelefono(tecnico.getTelefono());

        return tecnicoRepository.save(tecnicoDB);
    }

    @Override
    public void deleteTecnicoById(Long id) {
        tecnicoRepository.deleteById(id);
    }
}
