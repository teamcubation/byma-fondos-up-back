package com.byma.fondos_up_back.infrastructure.adapter.out.persistance;

import com.byma.fondos_up_back.application.port.out.GerenteOutPort;
import com.byma.fondos_up_back.application.validation.Validador;
import com.byma.fondos_up_back.domain.model.Gerente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GerenteOutAdapter implements GerenteOutPort {
    @Override
    public Gerente crear(Gerente gerente) {
        Validador.validadorParametrosNull(gerente);
        return null;
    }

    @Override
    public List<Gerente> listarGerentes() {
        return List.of();
    }

    @Override
    public Gerente obtenerPorIdOrganizacionGerente(Long idOrganizacionGerente) {
        Validador.validadorParametrosNull(idOrganizacionGerente);
        return null;
    }

    @Override
    public Gerente actualizar(Gerente gerente) {
        Validador.validadorParametrosNull(gerente);
        return null;
    }

    @Override
    public void eliminar(Long idOrganizacionGerente) {
        Validador.validadorParametrosNull(idOrganizacionGerente);

    }
}
