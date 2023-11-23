package com.comsion144.g3.tpiapspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "incidente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int tiempoResolucion;
    @ManyToOne
    @JoinColumn(name="servicio_id", referencedColumnName = "id")
    private Servicio servicio;
    //@OneToMany
    //private Set<RegistroDeIncidente> registroDeIncidente;

}
