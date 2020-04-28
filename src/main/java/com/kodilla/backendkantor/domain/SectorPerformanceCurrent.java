package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@Getter
@Setter
@Entity(name = "SECTOR_PERFORMANCE_CURRENT")
public class SectorPerformanceCurrent {
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

    public SectorPerformanceCurrent(Double value,Sector sector) {
        this.value=value;
        this.sector=sector;
    }
}
