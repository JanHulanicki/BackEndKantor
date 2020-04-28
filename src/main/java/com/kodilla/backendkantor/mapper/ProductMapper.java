package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.Product;
import com.kodilla.backendkantor.domain.ProductDto;
import com.kodilla.backendkantor.exception.ProductGroupNotFoundException;
import com.kodilla.backendkantor.repository.ProductGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {
    @Autowired
    private ProductGroupRepository productGroupRepository;

    public Product mapToProduct(final ProductDto productDto) throws ProductGroupNotFoundException {
        return new Product(
                productDto.getName(),
                productDto.getDescription(),
                productDto.getPrice(),
                productGroupRepository.findById(productDto.getProductGroupId()).orElseThrow(ProductGroupNotFoundException::new));
    }

    public ProductDto mapToProductDto(final Product product) {
        return new ProductDto(
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getProductGroup().getId());
    }

    public List<ProductDto> mapToProductDtoList(final List<Product> productList) {
        return productList.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }
}

