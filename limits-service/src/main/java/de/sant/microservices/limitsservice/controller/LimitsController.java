package de.sant.microservices.limitsservice.controller;

import de.sant.microservices.limitsservice.config.LimitConfiguration;
import de.sant.microservices.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitConfiguration config;

    @GetMapping("/limits")
    public Limits getLimit() {
        return new Limits(config.getMinimum(), config.getMaximum());
    }
}
