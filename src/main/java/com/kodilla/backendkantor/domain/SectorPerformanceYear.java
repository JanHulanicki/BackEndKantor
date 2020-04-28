package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "SECTOR_PERFORMANCE_YEAR")
public class SectorPerformanceYear {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERFORMANCE_ID")
    private Long performanceId;
    @Column(name = "PERFORMANCE_VALUE")
    private Double value;
    @JoinColumn(name = "SECTOR_ID", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Sector sector;
    public SectorPerformanceYear(Double value,Sector sector) {
        this.value=value;
        this.sector=sector;
    }

}
