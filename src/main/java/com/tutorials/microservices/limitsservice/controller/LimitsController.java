package com.tutorials.microservices.limitsservice.controller;

import com.tutorials.microservices.limitsservice.bean.Limits;
import com.tutorials.microservices.limitsservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retriveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
