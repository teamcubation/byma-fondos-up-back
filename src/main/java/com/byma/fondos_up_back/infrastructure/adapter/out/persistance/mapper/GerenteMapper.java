package com.byma.fondos_up_back.infrastructure.adapter.out.persistance.mapper;

import com.byma.fondos_up_back.application.validation.Validador;
import com.byma.fondos_up_back.domain.model.Gerente;
import com.byma.fondos_up_back.infrastructure.adapter.out.persistance.entity.GerenteEntity;

import java.util.List;
import java.util.stream.Collectors;

public class GerenteMapper {

    public static GerenteEntity gerenteAGerenteEntity(Gerente gerente) {
        Validador.validadorParametrosNull(gerente);

        return GerenteEntity.builder()
                .idOrganizacionGerente(gerente.getIdOrganizacionGerente())
                .idRegistro(gerente.getIdRegistro())
                .denominacion(gerente.getDenominacion())
                .liquidaEnByma(gerente.isLiquidaEnByma())
                .habilitado(gerente.isHabilitado())
                .tieneRelacion(gerente.isTieneRelacion())
                .observaciones(gerente.getObservaciones())
                .build();
    }


    public static Gerente gerenteEntityAGerente(GerenteEntity gerenteEntity) {
        Validador.validadorParametrosNull(gerenteEntity);
        return Gerente.builder()
                .idOrganizacionGerente(gerenteEntity.getIdOrganizacionGerente())
                .idRegistro(gerenteEntity.getIdRegistro())
                .denominacion(gerenteEntity.getDenominacion())
                .liquidaEnByma(gerenteEntity.isLiquidaEnByma())
                .habilitado(gerenteEntity.isHabilitado())
                .tieneRelacion(gerenteEntity.isTieneRelacion())
                .observaciones(gerenteEntity.getObservaciones())
                .build();
    }
    public static List<Gerente> gerenteEntitiesAGerentes(List<GerenteEntity> gerenteEntities) {
        return gerenteEntities.stream()
                .map(GerenteMapper::gerenteEntityAGerente)
                .collect(Collectors.toList());
    }
}
