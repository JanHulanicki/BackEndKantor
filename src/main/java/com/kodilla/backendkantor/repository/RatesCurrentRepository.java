package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.Cart;
import com.kodilla.backendkantor.domain.RatesCurrent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface RatesCurrentRepository extends JpaRepository<RatesCurrent, Long> {
    @Override
    List<RatesCurrent> findAll();
    @Override
    RatesCurrent  save(RatesCurrent ratesCurrent);

    @Override
    Optional<RatesCurrent> findById(Long aLong);
}
