package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.Cart;
import com.kodilla.backendkantor.domain.RatesDaily;
import com.kodilla.backendkantor.domain.SectorPerformanceYear;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SectorPerformanceYearRepository extends JpaRepository<SectorPerformanceYear, Long> {
    @Override
    List<SectorPerformanceYear> findAll();
    @Override
    SectorPerformanceYear save(SectorPerformanceYear sectorPerformanceYear);

    @Override
    Optional<SectorPerformanceYear> findById(Long aLong);
}
