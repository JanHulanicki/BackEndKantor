package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.ActionType;
import com.kodilla.backendkantor.domain.Product;
import com.kodilla.backendkantor.domain.Sector;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SectorRepository extends JpaRepository<Sector, Long> {
    @Override
    List<Sector> findAll();

    @Override
    Product save(Sector actionType);

    @Override
    Optional<Sector> findById(Long sectorId);

    @Override
    void deleteById(Long sectorId);
}
