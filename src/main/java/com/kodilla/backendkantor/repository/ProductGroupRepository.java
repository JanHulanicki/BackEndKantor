package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {
    @Override
    List<ProductGroup> findAll();

    @Override
    Optional<ProductGroup> findById(Long id);

    @Override
    ProductGroup save(ProductGroup productGroup);
}
