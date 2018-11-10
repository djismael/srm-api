package br.com.srm.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.srm.model"})
@EnableJpaRepositories(basePackages = {"br.com.srm.repository"})
@ComponentScan(basePackages = {"br.com.srm.*"})
public class SrmApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrmApiApplication.class, args);
    }
}
