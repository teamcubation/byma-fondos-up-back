package com.byma.fondos_up_back.application.port.out;

import com.byma.fondos_up_back.domain.model.Gerente;

import java.util.List;

public interface GerenteOutPort {

    Gerente crear(Gerente gerente);

    List<Gerente> listarGerentes();

    Gerente obtenerPorIdOrganizacionGerente(Long idOrganizacionGerente);

    Gerente actualizar(Gerente gerente);

    void eliminar(Long idOrganizacionGerente);
}
