package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.Cart;
import com.kodilla.backendkantor.domain.CartDto;
import com.kodilla.backendkantor.exception.UserNotFoundException;
import com.kodilla.backendkantor.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartMapper {
    @Autowired
    UserRepository userRepository;


    public CartDto mapToCartDto(final Cart cart) {
        return new CartDto(cart.getCartId(), cart.getCreated(), cart.getUser().getId());
    }

    public Cart mapToCart(final CartDto cartDto) throws UserNotFoundException {
        Cart cart = new Cart();
        cart.setCartId(cartDto.getCartId());

        cart.setUser(userRepository.findById(cartDto.getUserId()).orElseThrow(UserNotFoundException::new));

        cart.setCreated(cartDto.getCreated());
        return cart;
    }
}
