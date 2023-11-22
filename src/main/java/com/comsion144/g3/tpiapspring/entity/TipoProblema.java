package com.comsion144.g3.tpiapspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "tipo_problema")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoProblema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    @Column(name = "tiempoEstimado(Dias)")
    private Integer tiempo;
    @ManyToMany(mappedBy = "problemas")
    Set<Especialidad> especialidades;
}
