package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
    @Override
    List<OrderProduct> findAll();


}