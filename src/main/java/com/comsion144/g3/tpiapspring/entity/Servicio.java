package com.comsion144.g3.tpiapspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "servicio")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    @ManyToMany
    private List<Cliente> clientes;
    @OneToMany
    private List<Incidente> incidentes;


}
