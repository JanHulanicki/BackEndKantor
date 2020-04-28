package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    List<Product> findAll();

    @Override
    Product save(Product product);

    @Override
    Optional<Product> findById(Long productId);

    @Override
    void deleteById(Long productId);
}
