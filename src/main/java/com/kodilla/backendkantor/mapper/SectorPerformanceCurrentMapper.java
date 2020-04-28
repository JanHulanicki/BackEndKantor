package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.SectorPerformanceCurrent;
import com.kodilla.backendkantor.domain.SectorPerformanceCurrentDto;
import com.kodilla.backendkantor.exception.SectorNotFaundException;
import com.kodilla.backendkantor.repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SectorPerformanceCurrentMapper {
    @Autowired
    SectorRepository sectorRepository;

    public SectorPerformanceCurrentDto mapToSectorPerformanceCurrentDto(final SectorPerformanceCurrent sectorPerformanceCurrent) {
        return new SectorPerformanceCurrentDto(sectorPerformanceCurrent.getValue(), sectorPerformanceCurrent.getSector().getSectorId());
    }

    public SectorPerformanceCurrent mapToSectorPerformanceCurrent(final SectorPerformanceCurrentDto sectorPerformanceCurrentDto) throws SectorNotFaundException {
        SectorPerformanceCurrent sectorPerformanceCurrent = new SectorPerformanceCurrent();
        sectorPerformanceCurrent.setValue(sectorPerformanceCurrentDto.getValue());
        sectorPerformanceCurrent.setSector(sectorRepository.findById(sectorPerformanceCurrentDto.getSectorId()).orElseThrow(SectorNotFaundException::new));
        return sectorPerformanceCurrent;
    }
}
