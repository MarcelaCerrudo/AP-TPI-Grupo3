package com.comsion144.g3.tpiapspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "registro_incidente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroDeIncidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaIncidente;
    private Date fechaResolucion;
    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName = "id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name="incidente_id", referencedColumnName = "id")
    private Incidente incidente;
    @ManyToOne
    @JoinColumn(name="tecnico_id", referencedColumnName = "id")
    private Tecnico tecnico;
    @ManyToMany
    Set<TipoProblema> problema;
    private String detalleProblema;
    private String observacionTecnica;
    private Boolean resuelto;

}