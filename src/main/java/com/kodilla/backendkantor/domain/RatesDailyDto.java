package com.kodilla.backendkantor.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;
@Getter
@Setter
public class RatesDailyDto {
    private Long rateId;
    private Date created;
    private Double price;
    private Long productId;

    public RatesDailyDto(Date created,  Double price) {
        this.created = created;
        this.price = price;
    }
}
