package com.springframework.blondeforactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:blonde-config.xml")
public class BlondeForActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlondeForActuatorApplication.class, args);
    }

}
