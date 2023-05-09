package pl.wasik.damian.pharmacy.api.sales.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SalesDetailsModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesDetailsModuleApplication.class, args);
	}

	@Bean
	public Docket get() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/**"))
				.apis(RequestHandlerSelectors.basePackage("pl.wasik.damian.pharmacy.api.sales.details"))
				.build().apiInfo(createApiInfo());
	}

	private ApiInfo createApiInfo() {
		return new ApiInfo("sales-details-module",
				"API for DOZ Pharmacy sales details module.",
				"1.00",
				"",
				new Contact("Damian", "", "damian.wasik.dev@gmail.com"),
				"my own licence",
				"",
				Collections.emptyList()
		);
	}
}
