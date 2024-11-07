package com.byma.fondos_up_back.infrastructure.adapter.out.persistance;

import com.byma.fondos_up_back.application.port.out.GerenteOutPort;
import com.byma.fondos_up_back.domain.model.Gerente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GerenteOutAdapter implements GerenteOutPort {
    @Override
    public Gerente crear(Gerente gerente) {
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
    public Gerente actualizar(Gerente gerente) {
        return null;
    }

    @Override
    public void eliminar(Long idOrganizacionGerente) {

    }
}
