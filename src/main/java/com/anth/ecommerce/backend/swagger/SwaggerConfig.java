package com.anth.ecommerce.backend.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "User API", version = "${api.version}",
                contact = @Contact(name = "", email = "", url = ""),
                license = @License(name = "", url = ""), termsOfService = "${tos.uri}",
                description = "${api.description}"),
        servers = {
                @Server(url = "http://localhost:8080", description = "Development"),
                @Server(url = "${api.server.url}", description = "Production")})

public class SwaggerConfig {

    @Bean

    public OpenAPI customizeOpenAPI() {
        //@formatter:off
        final String securitySchemeName = "bearerAuth";
        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement()
                        .addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                                .name(securitySchemeName)
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .description(
                                        "Provide the JWT token. JWT token can be obtained from the Login API.")
                                .bearerFormat("JWT")));
        //@formatter:on

    }

}
