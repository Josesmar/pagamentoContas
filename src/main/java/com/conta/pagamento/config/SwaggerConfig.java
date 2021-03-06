//package com.conta.pagamento.config;
//
//import com.conta.pagamento.entity.Credito;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ParameterBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.schema.ModelRef;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.VendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket forumApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.pagamentocontas"))
//                .paths(PathSelectors.ant("/**"))
//                .build()
//                .apiInfo(metaInfo())
//                .ignoredParameterTypes(Credito.class)
//                .globalOperationParameters(Arrays.asList(
//                        new ParameterBuilder()
//                                .name("Authorization")
//                                .description("Header para token JWT")
//                                .modelRef(new ModelRef("string"))
//                                .parameterType("header")
//                                .required(false)
//                                .build()));
//    }
//    private ApiInfo metaInfo() {
//        ApiInfo apiInfo = new ApiInfo(
//                "Users API REST",
//                "API REST de Credito",
//                "1.0",
//                "Terms of Service",
//                new Contact("Josesmar Santos", "https://www.linkedin.com/in/josesmar-santos-7bb53241/",
//                        "josesmargds@gmail.com"),
//                "Apache License Version 2.0",
//                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
//        );
//        return apiInfo;
//    }
//}
//
