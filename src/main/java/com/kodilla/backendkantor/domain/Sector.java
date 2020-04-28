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
@Entity(name = "SECTORS")
public class Sector {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SECTOR_ID")
    private Long sectorId;
    @Column(name = "NAME")
    private  String name;

    public Sector(String name) {
        this.name=name;
    }
}
