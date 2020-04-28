package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.ActionType;
import com.kodilla.backendkantor.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ActionTypeRepository extends JpaRepository<ActionType, Long> {
    @Override
    List<ActionType> findAll();

    @Override
    Product save(ActionType actionType);

    @Override
    Optional<ActionType> findById(Long actionId);

    @Override
    void deleteById(Long actionId);
}

