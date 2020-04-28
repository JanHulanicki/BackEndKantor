package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.SectorPerformanceCurrent;
import com.kodilla.backendkantor.domain.SectorPerformanceYear;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SectorPerformanceCurrentRepository extends JpaRepository<SectorPerformanceCurrent, Long> {
    @Override
    List<SectorPerformanceCurrent> findAll();
    @Override
    SectorPerformanceCurrent save(SectorPerformanceCurrent sectorPerformanceCurrent);

    @Override
    Optional<SectorPerformanceCurrent> findById(Long aLong);

}
