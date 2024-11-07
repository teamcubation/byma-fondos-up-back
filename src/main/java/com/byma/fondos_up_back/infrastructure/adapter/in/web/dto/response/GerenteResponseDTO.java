package com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GerenteResponseDTO {
    private Long idRegistro;
    private Long idOrganizacionGerente;
    private String denominacion;
    private Boolean liquidaEnByma;
    private Boolean habilitado;
    private Boolean tieneRelacion;
    private String observaciones;
}
