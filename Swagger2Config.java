package com.colon.labs.artistx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.colon.labs.artistx.controller"))              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiEndPointsInfo());                                           
    }
	
	 private ApiInfo apiEndPointsInfo() {
	        return new ApiInfoBuilder().title("ArtistX APIs")
	            .description("Backend APIs based on REST")
	            .contact(new Contact("Surya Verma", "https://www.linkedin.com/in/surverma/", "suryakv12@gmail.com"))
	            .license("Copyright")
	            .licenseUrl("https://www.linkedin.com/in/surverma/")
	            .version("1.0.0")
	            .build();
	    }
}
