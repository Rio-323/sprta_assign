package org.sparta.sparta_asssign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpartaAsssignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpartaAsssignApplication.class, args);
    }

}
