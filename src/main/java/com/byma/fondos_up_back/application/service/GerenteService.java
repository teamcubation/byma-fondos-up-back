package com.byma.fondos_up_back.application.service;

import com.byma.fondos_up_back.application.port.in.GerenteInPort;
import com.byma.fondos_up_back.application.port.out.GerenteOutPort;
import com.byma.fondos_up_back.domain.model.Gerente;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.request.GerenteRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteService implements GerenteInPort {

    private GerenteOutPort gerenteOutPort;

    @Override
    public Gerente crear(GerenteRequestDTO gerenteRequestDTO) {
        return null;
    }

    @Override
    public List<Gerente> listarGerentes() {
        return List.of();
    }

    @Override
    public Gerente obtenerPorIdOrganizacionGerente(Long idOrganizacionGerente) {
        return null;
    }

    @Override
    public Gerente actualizar(GerenteRequestDTO gerenteRequestDTO) {
        return null;
    }

    @Override
    public void eliminar(Long idOrganizacionGerente) {

    }
}
