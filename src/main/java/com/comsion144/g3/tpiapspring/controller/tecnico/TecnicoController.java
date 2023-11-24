package com.comsion144.g3.tpiapspring.controller.tecnico;

import com.comsion144.g3.tpiapspring.entity.Tecnico;
import com.comsion144.g3.tpiapspring.service.tecnico.TecnicoService;
import com.comsion144.g3.tpiapspring.service.tecnico.TecnicoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class TecnicoController {
    @Autowired
    private TecnicoServiceImpl tecnicoService;

    //Create
    @PostMapping("/tecnico")
    public Tecnico saveTecnico(@Validated @RequestBody Tecnico tecnico){
        return tecnicoService.saveTecnico(tecnico);
    }
    @GetMapping("/tecnico")
    public List<Tecnico> fetchTecnicoList(){
        return tecnicoService.getAllTecnico();
    }
    @PutMapping("tecnico/{id}")
    public Tecnico updateTecnico(@RequestBody Tecnico tecnico, @PathVariable("id") Long id){
        return tecnicoService.updateTecnico(tecnico,id);
    }
    @DeleteMapping("tecnico/{id}")
    public String deleteTecnicoById(@PathVariable("id") Long id){
        tecnicoService.deleteTecnicoById(id);
        return "Tecnico Eliminado Correctamente";
    }


}
