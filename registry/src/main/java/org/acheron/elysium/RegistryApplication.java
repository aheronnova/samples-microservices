package org.acheron.elysium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class RegistryApplication {

    public RegistryApplication() {
    }

    public static void main(final String[] args) {
        SpringApplication.run(RegistryApplication.class, args);
    }
}
