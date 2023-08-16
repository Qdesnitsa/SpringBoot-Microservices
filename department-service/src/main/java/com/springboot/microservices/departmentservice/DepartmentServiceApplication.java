package com.springboot.microservices.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "Department Service REST APIs",
                description = "Department Service REST APIs Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Elena",
                        email = "https://www.linkedin.com/in/elena-sidina/",
                        url = "https://github.com/Qdesnitsa"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.elenasidina.net/license"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot User Management Documentation",
                url = "https://www.elenasidina.net/user_management.html"
        )
)

@SpringBootApplication
public class DepartmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }

}
