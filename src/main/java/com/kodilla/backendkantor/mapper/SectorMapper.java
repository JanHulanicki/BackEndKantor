package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.Sector;
import com.kodilla.backendkantor.domain.SectorDto;
import org.springframework.stereotype.Component;

@Component
public class SectorMapper {
    public SectorDto mapToSectorDto(final Sector sector) {
        return new SectorDto(sector.getSectorId(), sector.getName());
    }

    public Sector mapToSector(final SectorDto sectorDto) {
        Sector sector = new Sector();
        sector.setSectorId(sectorDto.getSectorId());
        sector.setName(sectorDto.getName());
        return sector;
    }
}
