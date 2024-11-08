package com.byma.fondos_up_back.infrastructure.adapter.in.web.controller;

import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.request.GerenteRequestDTO;
import com.byma.fondos_up_back.infrastructure.adapter.in.web.dto.response.GerenteResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Tag(name = "Gerente", description = "Api para gestionar sociedades gerentes")

public interface ApiGerente {

    @Operation(summary = "Crear sociedad gerente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Sociedad gerente creada exitosamente"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    ResponseEntity<GerenteResponseDTO> crear(@RequestBody @Valid GerenteRequestDTO gerenteRequestDTO);

    @Operation(summary = "Obtener todas las sociedades gerentes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sociedades gerentes encontradas"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    ResponseEntity<List<GerenteResponseDTO>> listarGerentes();

    @Operation(summary = "Obtener una sociedad gerente por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sociedad gerente encontrada"),
            @ApiResponse(responseCode = "404", description = "Error: Sociedad gerente no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    ResponseEntity<GerenteResponseDTO> obtenerPorIdOrganizacionGerente(@PathVariable Long idOrganizacionGerente);

    @Operation(summary = "Actualizar una sociedad gerente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sociedad gerente actualizada exitosamente"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    ResponseEntity<GerenteResponseDTO> actualizar(@PathVariable Long idOrganizacionGerente, @RequestBody @Valid GerenteRequestDTO gerenteRequestDTO);

    @Operation(summary = "Eliminar una sociedad gerente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Sociedad gerente eliminada exitosamente"),
            @ApiResponse(responseCode = "404", description = "Error: Sociedad gerente no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    ResponseEntity<Void> eliminar(@PathVariable Long idOrganizacionGerente);





}
