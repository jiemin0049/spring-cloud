package de.sant.microservices.currencyexchangeservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/sample-api")
    //@Retry(name = "sample-api", fallbackMethod = "hardcodedResponse")
    @CircuitBreaker(name = "sample-api", fallbackMethod = "hardcodedResponse")
    @RateLimiter(name = "default")
    //10s ->10000 calls to the sample api
    public String sampleApi() {
        logger.info("Sample API called!");
        ResponseEntity<String> entity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", String.class);
        return entity.getBody();
        //return "SampleAPI";
    }

    public String hardcodedResponse(Exception ex) {
        return "fallback-response";
    }
}
