package org.mvnsearch.dotenvx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DotenvxApp {
    public static void main(String[] args) {
        SpringApplication.run(DotenvxApp.class, args);
    }

    @Bean
    public ApplicationRunner runner(@Value("${example.name}") String name) {
        return args -> {
            System.out.println("Hello " + name);
        };
    }
}
