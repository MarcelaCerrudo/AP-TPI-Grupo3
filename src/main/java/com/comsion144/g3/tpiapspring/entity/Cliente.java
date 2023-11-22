package com.comsion144.g3.tpiapspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String razonSocial;
    private String CUIT;
    private String mail;
    @ManyToMany(mappedBy = "clientes")
    private List<Servicio> serviciosContratados;
    @OneToMany
    private List<RegistroDeIncidentes> registroDeIncidentes;

}
