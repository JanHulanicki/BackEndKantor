package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.Cart;
import com.kodilla.backendkantor.domain.RatesDaily;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatesDailyRepository extends JpaRepository<RatesDaily, Long> {
    @Override
    List<RatesDaily> findAll();
    @Override
    RatesDaily save(RatesDaily ratesDaily);

    @Override
    Optional<RatesDaily> findById(Long aLong);
}
