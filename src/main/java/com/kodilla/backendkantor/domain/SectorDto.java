package com.kodilla.backendkantor.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
@Getter
@Setter

public class SectorDto {
    private Long sectorId;
    private  String name;
    public SectorDto(Long sectorId, String name) {
        this.name=name;
    }
}
