package com.byma.fondos_up_back.infrastructure.adapter.in.web.controller.impl;

import com.byma.fondos_up_back.application.port.in.GerenteInPort;
import com.byma.fondos_up_back.application.validation.Validador;
import com.byma.fondos_up_back.domain.model.Gerente;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.request.GerenteRequestDTO;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.response.GerenteResponseDTO;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.mapper.GerenteControllerMapper;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/gerentes")
@Slf4j
public class GerenteController {

    private final GerenteInPort gerenteInPort;

    public GerenteController(GerenteInPort gerenteInPort) {
        this.gerenteInPort = gerenteInPort;
    }

    @PostMapping("")
    public ResponseEntity<GerenteResponseDTO> crear(@RequestBody @Valid GerenteRequestDTO gerenteRequestDTO) {

        log.info("Solicitud para crear un gerente: {}", gerenteRequestDTO);
        Validador.validadorParametrosNull(gerenteRequestDTO);
        Gerente gerenteCreado = gerenteInPort.crear(GerenteControllerMapper.gerenteRequestDtoAGerente(gerenteRequestDTO));
        log.info("Creacion de gerente finalizada: {}", gerenteCreado);

        return ResponseEntity.ok().body(GerenteControllerMapper.gerenteAGerenteResponseDTO(gerenteCreado));
    }

    @GetMapping("")
    public ResponseEntity<List<GerenteResponseDTO>> listarGerentes() {

        log.info("Solicitud para obtener todos los gerentes");
        List<Gerente> gerentes = gerenteInPort.listarGerentes();
        log.info("Finalizacion de la solicitud para obtener todos los gerentes");

        return ResponseEntity.ok().body(gerentes.stream().map(GerenteControllerMapper::gerenteAGerenteResponseDTO).toList());
    }

    @GetMapping("/{idOrganizacionGerente}")
    public ResponseEntity<GerenteResponseDTO> obtenerPorIdOrganizacionGerente(@PathVariable Long idOrganizacionGerente) {

        log.info("Solicitud para obtener gerente por id de organizacion: {}", idOrganizacionGerente);
        Validador.validadorParametrosNull(idOrganizacionGerente);
        Gerente gerente = gerenteInPort.obtenerPorIdOrganizacionGerente(idOrganizacionGerente);
        log.info("Finalizacion de obtener gerente por id de organicacion: {}", gerente);

        return ResponseEntity.ok().body(GerenteControllerMapper.gerenteAGerenteResponseDTO(gerente));
    }

    @PutMapping("/{idOrganizacionGerente}")
    public ResponseEntity<GerenteResponseDTO> actualizar(@PathVariable Long idOrganizacionGerente, @RequestBody @Valid GerenteRequestDTO gerenteRequestDTO) {

        log.info("Solicitud para actualizar gerente por id de organizacion: {}, datos a actualizar: {}",idOrganizacionGerente, gerenteRequestDTO);
        Validador.validadorParametrosNull(idOrganizacionGerente, gerenteRequestDTO);
        Gerente gerenteActualizado = gerenteInPort.actualizar(idOrganizacionGerente, GerenteControllerMapper.gerenteRequestDtoAGerente(gerenteRequestDTO));
        log.info("Finalizacion de actualizacion de gerente, gerente actualizado: {}", gerenteActualizado);

        return ResponseEntity.ok().body(GerenteControllerMapper.gerenteAGerenteResponseDTO(gerenteActualizado));
    }

    @DeleteMapping("/{idOrganizacionGerente}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idOrganizacionGerente) {

        log.info("Solicitud para eliminar gerente con id de organizacion: {}", idOrganizacionGerente);
        Validador.validadorParametrosNull(idOrganizacionGerente);
        gerenteInPort.eliminar(idOrganizacionGerente);
        log.info("Finalizacion de eliminacion de gerente con id de organizacion: {}", idOrganizacionGerente);

        return ResponseEntity.ok().build();
    }
}
