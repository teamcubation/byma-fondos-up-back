package com.byma.fondos_up_back.application.service;

import com.byma.fondos_up_back.application.port.in.GerenteInPort;
import com.byma.fondos_up_back.application.port.out.GerenteOutPort;
import com.byma.fondos_up_back.application.validation.Validador;
import com.byma.fondos_up_back.domain.model.Gerente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class GerenteService implements GerenteInPort {

    private final GerenteOutPort gerenteOutPort;

    public GerenteService(GerenteOutPort gerenteOutPort) {
        this.gerenteOutPort = gerenteOutPort;
    }

    @Override
    public Gerente crear(Gerente gerenteRequestDTO) {
        log.info("Crear gerente: {}", gerenteRequestDTO);
        Validador.validadorParametrosNull(gerenteRequestDTO);
        return gerenteOutPort.crear(gerenteRequestDTO);
    }

    @Override
    public List<Gerente> listarGerentes() {
        log.info("Obtener todos los gerentes");
        return gerenteOutPort.listarGerentes();
    }

    @Override
    public Gerente obtenerPorIdOrganizacionGerente(Long idOrganizacionGerente) {
        log.info("Obtener gerente por el id de organizacion: {}", idOrganizacionGerente);
        Validador.validadorParametrosNull(idOrganizacionGerente);
        return gerenteOutPort.obtenerPorIdOrganizacionGerente(idOrganizacionGerente);
    }

    @Override
    public Gerente actualizar(Long idOrganizacionGerente, Gerente gerenteRequestDTO) {
        log.info("Actualizar gerente con id de organizacion: {}, datos a actualizar: {}",idOrganizacionGerente, gerenteRequestDTO);
        Validador.validadorParametrosNull(idOrganizacionGerente, gerenteRequestDTO);
        gerenteRequestDTO.setIdOrganizacionGerente(idOrganizacionGerente);
        return gerenteOutPort.actualizar(gerenteRequestDTO);
    }

    @Override
    public void eliminar(Long idOrganizacionGerente) {
        log.info("Eliminar gerente");
        Validador.validadorParametrosNull(idOrganizacionGerente);
        gerenteOutPort.eliminar(idOrganizacionGerente);
    }
}
