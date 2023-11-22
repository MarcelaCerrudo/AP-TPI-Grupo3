package com.comsion144.g3.tpiapspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "especialidad")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   private String nombre;
   @ManyToMany(mappedBy = "especialidades")
   private List<Tecnico> tecnicos;

   @OneToMany
   private List<TipoProblema> problemas;

}
