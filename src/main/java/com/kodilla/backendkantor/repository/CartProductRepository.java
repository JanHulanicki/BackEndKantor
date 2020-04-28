package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.CartProduct;
import com.kodilla.backendkantor.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartProductRepository extends JpaRepository<CartProduct, Long> {
    @Override
    List<CartProduct> findAll();
    @Override
    CartProduct  saveAndFlush(CartProduct cart);
    Product save(Product product);
    @Override
    Optional<CartProduct> findById(Long aLong);
    @Override
    void deleteById(Long aLong);
}
