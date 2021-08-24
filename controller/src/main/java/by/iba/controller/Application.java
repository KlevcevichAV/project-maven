package by.iba.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "by.iba")
@EnableJpaRepositories(basePackages = "by.iba")
@EntityScan(basePackages = "by.iba")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
