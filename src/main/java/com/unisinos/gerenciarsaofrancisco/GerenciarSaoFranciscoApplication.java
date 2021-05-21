package com.unisinos.gerenciarsaofrancisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class GerenciarSaoFranciscoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciarSaoFranciscoApplication.class, args);
    }

}
