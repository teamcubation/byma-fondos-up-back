package com.byma.fondos_up_back.application.service;

import com.byma.fondos_up_back.application.port.in.GerenteInPort;
import com.byma.fondos_up_back.application.port.out.GerenteOutPort;
import com.byma.fondos_up_back.application.validation.Validador;
import com.byma.fondos_up_back.domain.model.Gerente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteService implements GerenteInPort {

    private final GerenteOutPort gerenteOutPort;

    public GerenteService(GerenteOutPort gerenteOutPort) {
        this.gerenteOutPort = gerenteOutPort;
    }

    @Override
    public Gerente crear(Gerente gerenteRequestDTO) {
        Validador.validadorParametrosNull(gerenteRequestDTO);
        return gerenteOutPort.crear(gerenteRequestDTO);
    }

    @Override
    public List<Gerente> listarGerentes() {
        return gerenteOutPort.listarGerentes();
    }

    @Override
    public Gerente obtenerPorIdOrganizacionGerente(Long idOrganizacionGerente) {
        Validador.validadorParametrosNull(idOrganizacionGerente);
        return gerenteOutPort.obtenerPorIdOrganizacionGerente(idOrganizacionGerente);
    }

    @Override
    public Gerente actualizar(Long idOrganizacionGerente, Gerente gerenteRequestDTO) {
        Validador.validadorParametrosNull(idOrganizacionGerente, gerenteRequestDTO);
        gerenteRequestDTO.setIdOrganizacionGerente(idOrganizacionGerente);
        return gerenteOutPort.actualizar(gerenteRequestDTO);
    }

    @Override
    public void eliminar(Long idOrganizacionGerente) {
        Validador.validadorParametrosNull(idOrganizacionGerente);
        gerenteOutPort.eliminar(idOrganizacionGerente);
    }
}
