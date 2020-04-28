package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.Cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface CartRepository extends JpaRepository<Cart, Long> {
   @Override
   List<Cart> findAll();
   @Override
   Cart  save(Cart cart);

   @Override
   Optional<Cart> findById(Long aLong);
}
