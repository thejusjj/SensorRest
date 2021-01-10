package com.thejusjj.SensorRest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {

	@Bean
	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.any())
//				.paths(PathSelectors.any())
//				.build();
		
		return new Docket(DocumentationType.SWAGGER_2).select()
		         .apis(RequestHandlerSelectors.basePackage("com.thejusjj.SensorRest")).build().apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Sensor Example API").contact(new Contact("Thejus Joseph Jose","","thejusjj@gmail.com")).version("1.0.0").build();
    }
}
