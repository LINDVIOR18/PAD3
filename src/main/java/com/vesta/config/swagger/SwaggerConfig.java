package com.vesta.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Optional;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//    @Value("${vesta.swagger.host}")
//    private String host;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
//                (host)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.vesta.controller"))
//                .paths(PathSelectors.regex(REGEX_PATH))
                .build()
                .apiInfo(apiEndPointsInfo())
                .useDefaultResponseMessages(false)
                .genericModelSubstitutes(Optional.class);
//                .securitySchemes(Collections.singletonList(apiKey()))
//                .securityContexts(Collections.singletonList(securityContext()));
    }

    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("VESTA REST API ")
                .description("Office Management Tool REST API")
                .version("1.0.0")
                .build();
    }

//    private ApiKey apiKey() {
//        return new ApiKey(API_KEY_NAME, TOKEN_HEADER, SWAGGER_HEADER_AS);
//    }
//
//    private SecurityContext securityContext() {
//        return SecurityContext.builder()
//                .securityReferences(defaultAuth())
//                .forPaths(PathSelectors.regex(REGEX_PATH))
//                .build();
//    }
//
//    private List<SecurityReference> defaultAuth() {
//        AuthorizationScope authorizationScope
//                = new AuthorizationScope(GLOBAL_SCOPE, ACCESS_DESCRIPTION);
//        return Collections.singletonList(
//                new SecurityReference(API_KEY_NAME, new AuthorizationScope[]{authorizationScope}));
//    }
}
