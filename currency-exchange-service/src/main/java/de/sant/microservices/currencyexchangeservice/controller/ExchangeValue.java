package de.sant.microservices.currencyexchangeservice.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ExchangeValue {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
}
