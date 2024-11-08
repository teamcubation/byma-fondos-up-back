package com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GerenteRequestDTO {
    private Long idOrganizacionGerente;
    @NotNull
    private Long idRegistro;
    @NotNull
    @NotBlank
    private String denominacion;
    @NotNull
    private Boolean liquidaEnByma;
    @NotNull
    private Boolean habilitado;
    @NotNull
    private Boolean tieneRelacion;
    private String observaciones;
}
