package com.byma.fondos_up_back.infrastructure.adapter.in.web.mapper;

import com.byma.fondos_up_back.domain.model.Gerente;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.request.GerenteRequestDTO;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.response.GerenteResponseDTO;

public class GerenteControllerMapper {

    public static Gerente gerenteRequestDTOToGerente(GerenteRequestDTO gerenteRequestDTO) {
        return Gerente.builder()
                .idOrganizacionGerente(gerenteRequestDTO.getIdOrganizacionGerente())
                .denominacion(gerenteRequestDTO.getDenominacion())
                .liquidaEnByma(gerenteRequestDTO.getLiquidaEnByma())
                .habilitado(gerenteRequestDTO.getHabilitado())
                .tieneRelacion(gerenteRequestDTO.getTieneRelacion())
                .observaciones(gerenteRequestDTO.getObservaciones())
                .build();
    }

    public static GerenteResponseDTO gerenteToGerenteResponseDTO(Gerente gerente) {
        return GerenteResponseDTO.builder()
                .idRegistro(gerente.getIdRegistro())
                .idOrganizacionGerente(gerente.getIdOrganizacionGerente())
                .denominacion(gerente.getDenominacion())
                .liquidaEnByma(gerente.isLiquidaEnByma())
                .habilitado(gerente.isHabilitado())
                .tieneRelacion(gerente.isTieneRelacion())
                .observaciones(gerente.getObservaciones())
                .build();
    }
}
