package com.byma.fondos_up_back.infrastructure.adapter.in.web.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;

@OpenAPIDefinition(
        info = @Info(
                title = "Api gerentes",
                description = "Api para gestionar sociedades gerentes",
                version = "1.0.0"
        ),
        servers = {
                @Server(
                        description = "DEV SERVER",
                        url = "http://localhost:8080",
                        variables = {
                                @ServerVariable(name = "port", defaultValue = "${server.port}")
                        }
                )
        }
)

public class SwaggerConfig {

}
