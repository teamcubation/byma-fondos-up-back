package com.byma.fondos_up_back.infrastructure.adapter.in.web.controller;

import com.byma.fondos_up_back.application.port.in.GerenteInPort;
import com.byma.fondos_up_back.domain.model.Gerente;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.request.GerenteRequestDTO;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.response.GerenteResponseDTO;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.mapper.GerenteControllerMapper;
import jakarta.validation.Valid;
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
@RequestMapping("/api/v1/gerente")
public class GerenteController {

    private final GerenteInPort gerenteInPort;

    public GerenteController(GerenteInPort gerenteInPort) {
        this.gerenteInPort = gerenteInPort;
    }

    @PostMapping("")
    public ResponseEntity<GerenteResponseDTO> crear(@RequestBody @Valid GerenteRequestDTO gerenteRequestDTO) {
        Gerente gerenteCreado = gerenteInPort.crear(GerenteControllerMapper.gerenteRequestDTOToGerente(gerenteRequestDTO));
        return ResponseEntity.ok().body(GerenteControllerMapper.gerenteToGerenteResponseDTO(gerenteCreado));
    }

    @GetMapping("")
    public ResponseEntity<List<GerenteResponseDTO>> listarGerentes() {
        List<Gerente> gerentes = gerenteInPort.listarGerentes();
        return ResponseEntity.ok().body(gerentes.stream().map(GerenteControllerMapper::gerenteToGerenteResponseDTO).toList());
    }

    @GetMapping("/{idOrganizacionGerente}")
    public ResponseEntity<GerenteResponseDTO> obtenerPorIdOrganizacionGerente(@PathVariable Long idOrganizacionGerente) {
        Gerente gerente = gerenteInPort.obtenerPorIdOrganizacionGerente(idOrganizacionGerente);
        return ResponseEntity.ok().body(GerenteControllerMapper.gerenteToGerenteResponseDTO(gerente));
    }

    @PutMapping("/{idOrganizacionGerente}")
    public ResponseEntity<GerenteResponseDTO> actualizar(@PathVariable Long idOrganizacionGerente, @RequestBody @Valid GerenteRequestDTO gerenteRequestDTO) {
        Gerente gerenteActualizado = gerenteInPort.actualizar(idOrganizacionGerente, GerenteControllerMapper.gerenteRequestDTOToGerente(gerenteRequestDTO));
        return ResponseEntity.ok().body(GerenteControllerMapper.gerenteToGerenteResponseDTO(gerenteActualizado));
    }

    @DeleteMapping("/{idOrganizacionGerente}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idOrganizacionGerente) {
        gerenteInPort.eliminar(idOrganizacionGerente);
        return ResponseEntity.ok().build();
    }
}
