package com.thirumal.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;

@Configuration
public class OpenApiConfig {
	@Bean
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("User API")
                        .description("API with validation and localization support")
                        .version("1.0.0"));
    }

    // Optional: Apply global header parameter to all endpoints
    @Bean
    GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("user-api")
                .addOperationCustomizer((operation, handlerMethod) -> {
                    operation.addParametersItem(new Parameter()
                            .name("Accept-Language")
                            .description("Language for localized messages (e.g., en, fr, ta)")
                            .in("header")
                            .schema(new StringSchema().example("en")));
                    return operation;
                })
                .build();
    }
}
