package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.SectorPerformanceYear;
import com.kodilla.backendkantor.domain.SectorPerformanceYearDto;
import com.kodilla.backendkantor.exception.SectorNotFaundException;
import com.kodilla.backendkantor.repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SectorPerformanceYearMapper {
    @Autowired
    SectorRepository sectorRepository;

    public SectorPerformanceYearDto mapToSectorPerformanceYearDto(final SectorPerformanceYear sectorPerformanceYear) {
        return new SectorPerformanceYearDto(sectorPerformanceYear.getValue(), sectorPerformanceYear.getSector().getSectorId());
    }

    public SectorPerformanceYear mapToSectorPerformanceYear(final SectorPerformanceYearDto sectorPerformanceYearDto) throws SectorNotFaundException {
        SectorPerformanceYear sectorPerformanceYear = new SectorPerformanceYear();
        sectorPerformanceYear.setValue(sectorPerformanceYearDto.getValue());
        sectorPerformanceYear.setSector(sectorRepository.findById(sectorPerformanceYearDto.getSectorId()).orElseThrow(SectorNotFaundException::new));
        return sectorPerformanceYear;
    }
}

