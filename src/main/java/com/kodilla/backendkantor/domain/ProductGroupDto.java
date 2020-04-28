package com.kodilla.backendkantor.domain;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ProductGroupDto {
    private Long id;
    private String name;
    public ProductGroupDto(String name) {
        this.name = name;
    }
}
