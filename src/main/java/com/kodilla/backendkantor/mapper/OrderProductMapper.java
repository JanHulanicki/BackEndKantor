package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.OrderProduct;
import com.kodilla.backendkantor.domain.OrderProductDto;
import com.kodilla.backendkantor.domain.ProductDto;
import com.kodilla.backendkantor.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderProductMapper {
    @Autowired
    OrderProductRepository orderProductRepository;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    ProductMapper productMapper;
    public OrderProductDto mapToOrderProductDto(final OrderProduct orderProduct) {
        return new OrderProductDto(
                orderProduct.getId(),
                orderMapper.mapToOrderDto(orderProduct.getOrder()),
                productMapper.mapToProductDto(orderProduct.getProduct()),
                orderProduct.getAmount());
    }

    public List<OrderProductDto> mapToOrderProductDtoList(final List<OrderProduct> orderProductList) {
        return orderProductList.stream()
                .map(this::mapToOrderProductDto)
                .collect(Collectors.toList());
    }
    public ProductDto mapToProductDto(final OrderProduct orderProduct) {
        return new ProductDto(
                orderProduct.getProduct().getId(),
                orderProduct.getProduct().getName(),
                orderProduct.getProduct().getDescription(),
                orderProduct.getProduct().getPrice(),
                orderProduct.getProduct().getProductGroup().getId());
    }
    public List<ProductDto> mapToProductDtoList(final List<OrderProduct> orderProductList) {
        return orderProductList.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }
}