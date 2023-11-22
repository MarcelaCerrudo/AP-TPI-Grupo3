package com.comsion144.g3.tpiapspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "tecnico")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String mail;
    @Column(name = "num Teléfono")
    private String numTel;
    @ManyToMany
    private List<Especialidad> especialidades;





}
