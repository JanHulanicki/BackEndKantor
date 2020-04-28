package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrderProductDto {
    private Long id;
    private OrderDto order;
    private ProductDto product;
    private Double amount;
}
