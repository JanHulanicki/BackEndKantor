package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CartProductDto {
    private Long id;
    private CartDto cartDto;
    private ProductDto productDto;
    private Double amount;
}
