package de.sant.microservices.limitsservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("limits-service")
public class LimitConfiguration {
    int minimum;
    int maximum;
}
