package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "RATES_DAILY")
public class RatesCurrent {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RATE_ID")
    private Long rateId;
    @Column(name = "DATE")
    private Date created;
    @Column(name = "PRICE")
    private Double price;
    @JoinColumn(name = "PRODUCT_ID", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Product product;

    public RatesCurrent( Date created,Product product,Double price) {
        this.created=created;
        this.product = product;
        this.price=price;
    }
}
