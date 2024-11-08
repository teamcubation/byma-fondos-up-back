package com.byma.fondos_up_back.infrastructure.adapter.out.persistance;

import com.byma.fondos_up_back.application.port.out.GerenteOutPort;
import com.byma.fondos_up_back.application.validation.Validador;
import com.byma.fondos_up_back.domain.model.Gerente;
import com.byma.fondos_up_back.infrastructure.adapter.out.persistance.mapper.GerenteMapper;
import com.byma.fondos_up_back.infrastructure.adapter.out.persistance.repository.GerenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GerenteOutAdapter implements GerenteOutPort {

    @Autowired
    private GerenteRepository gerenteRepository;
    @Override
    public Gerente crear(Gerente gerente) {
        Validador.validadorParametrosNull(gerente);
        return GerenteMapper.gerenteEntityAGerente(gerenteRepository.save(GerenteMapper.gerenteAGerenteEntity(gerente)));
    }

    @Override
    public List<Gerente> listarGerentes() {
        return GerenteMapper.gerenteEntitiesAGerentes(gerenteRepository.findAll());
    }

    @Override
    public Gerente obtenerPorIdOrganizacionGerente(Long idOrganizacionGerente) {
        Validador.validadorParametrosNull(idOrganizacionGerente);
        return GerenteMapper.gerenteEntityAGerente(gerenteRepository.findById(idOrganizacionGerente).orElse(null));
    }

    @Override
    public Gerente actualizar(Gerente gerente) {
        Validador.validadorParametrosNull(gerente);
        return GerenteMapper.gerenteEntityAGerente(gerenteRepository.save(GerenteMapper.gerenteAGerenteEntity(gerente)));
    }

    @Override
    public void eliminar(Long idOrganizacionGerente) {
        Validador.validadorParametrosNull(idOrganizacionGerente);
        gerenteRepository.deleteById(idOrganizacionGerente);
    }
}
