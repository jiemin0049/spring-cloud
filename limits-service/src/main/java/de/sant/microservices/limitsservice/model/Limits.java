package de.sant.microservices.limitsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Limits {
    int minimum;
    int maximum;
}
