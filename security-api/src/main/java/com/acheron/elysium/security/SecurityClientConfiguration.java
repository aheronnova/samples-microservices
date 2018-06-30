package com.acheron.elysium.security;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author svb
 */
@Configuration
@EnableFeignClients(basePackages = "com.acheron.elysium.security.impl")
public class SecurityClientConfiguration {
}
