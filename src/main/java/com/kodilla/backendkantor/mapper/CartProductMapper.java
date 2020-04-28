package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.CartDto;
import com.kodilla.backendkantor.domain.CartProduct;
import com.kodilla.backendkantor.domain.CartProductDto;
import com.kodilla.backendkantor.domain.ProductDto;
import com.kodilla.backendkantor.exception.CartNotFoundException;
import com.kodilla.backendkantor.repository.CartRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartProductMapper {
    private final static Logger LOGGER = LoggerFactory.getLogger(CartProductMapper.class);
    @Autowired
    CartMapper cartMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    CartRepository cartRepository;

    public CartProductDto mapToCartProductDto(final CartProduct cartProduct) {
        CartDto cartDto = cartMapper.mapToCartDto(cartProduct.getCart());
        ProductDto productDto = productMapper.mapToProductDto(cartProduct.getProduct());
        return new CartProductDto(cartProduct.getId(), cartDto, productDto, cartProduct.getAmount());
    }

    public CartProduct mapToCartProduct(final CartProductDto cartProductDto) throws CartNotFoundException {
        CartProduct cartProduct = new CartProduct();
        cartProduct.setId(cartProductDto.getId());
        cartProduct.setCart(cartRepository.findById(cartProductDto.getCartDto().getCartId()).orElseThrow(CartNotFoundException::new));
        cartProduct.setAmount(cartProductDto.getAmount());
        return cartProduct;
    }
}
