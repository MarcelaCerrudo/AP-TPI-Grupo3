package com.comsion144.g3.tpiapspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "registroIncidentes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroDeIncidentes {
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
    private String detalles;
    private Boolean resuelto;

}