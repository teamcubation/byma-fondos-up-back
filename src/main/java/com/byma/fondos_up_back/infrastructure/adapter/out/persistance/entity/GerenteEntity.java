package com.byma.fondos_up_back.infrastructure.adapter.out.persistance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "gerente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GerenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gerente_seq")
    private Long idOrganizacionGerente;
    private Long idRegistro;
    private String denominacion;
    private boolean liquidaEnByma;
    private boolean habilitado;
    private boolean tieneRelacion;
    private String observaciones;
}
