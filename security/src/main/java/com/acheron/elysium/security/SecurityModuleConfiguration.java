package com.acheron.elysium.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author svb
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.acheron.security.controller"})
@EnableEurekaClient
@EnableCircuitBreaker
public class SecurityModuleConfiguration {

    public static void main(final String[] args) {
        SpringApplication.run(SecurityModuleConfiguration.class, args);
    }
}
