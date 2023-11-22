package com.comsion144.g3.tpiapspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipoProblema")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoProblema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    @Column(name = "tiempoEstimado(Días)")
    private Integer tiempo;
    @ManyToOne
    @JoinColumn(name="especialidad_id", referencedColumnName = "id")
    private Especialidad especialidad;
}
