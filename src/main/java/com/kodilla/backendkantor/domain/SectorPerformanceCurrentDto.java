package com.kodilla.backendkantor.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Getter
@Setter
public class SectorPerformanceCurrentDto {
    private Long performanceId;
    private Double value;
    private Long sectorId;
    public SectorPerformanceCurrentDto(Double value,Long sectorId ) {
        this.value=value;
        this.sectorId=sectorId;
    }
}
