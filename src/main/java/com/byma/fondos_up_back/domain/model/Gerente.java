package com.byma.fondos_up_back.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Gerente {

    private Long idRegistro;
    private Long idOrganizacionGerente;
    private String denominacion;
    private boolean liquidaEnByma;
    private boolean habilitado;
    private boolean tieneRelacion;
    private String observaciones;
}
