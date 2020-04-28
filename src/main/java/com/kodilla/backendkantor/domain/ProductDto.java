package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long productGroupId;
    public ProductDto(String name, String description, BigDecimal price, Long productGroupId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.productGroupId = productGroupId;
    }
}
