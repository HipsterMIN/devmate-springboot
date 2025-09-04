package kr.shipster.ai.devmate.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "DevMate API", description = "AI 개발 비서 API 문서", version = "v1")
)
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi devmateApi() {
        return GroupedOpenApi.builder()
                .group("DevMate")
                .pathsToMatch("/**")
                .build();
    }
}
