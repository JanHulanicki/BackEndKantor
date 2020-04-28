package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.ProductGroup;
import com.kodilla.backendkantor.domain.ProductGroupDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductGroupMapper {

    public ProductGroup mapToProductGroup(final ProductGroupDto productGroupDto) {
        return new ProductGroup(
                productGroupDto.getName());
    }

    public ProductGroupDto mapToProductGroupDto(final ProductGroup productGroup) {
        return new ProductGroupDto(
                productGroup.getName());
    }

    public List<ProductGroupDto> mapToProductGroupDtoList(final List<ProductGroup> productGroupList) {
        return productGroupList.stream()
                .map(this::mapToProductGroupDto)
                .collect(Collectors.toList());
    }
}
