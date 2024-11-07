package com.byma.fondos_up_back.application.port.in;

import com.byma.fondos_up_back.domain.model.Gerente;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.request.GerenteRequestDTO;

import java.util.List;

public interface GerenteInPort {

    Gerente crear(Gerente gerenteRequestDTO);

    List<Gerente> listarGerentes();

    Gerente obtenerPorIdOrganizacionGerente(Long idOrganizacionGerente);

    Gerente actualizar(Long idOrganizacionGerente,Gerente gerenteRequestDTO);

    void eliminar(Long idOrganizacionGerente);
}
