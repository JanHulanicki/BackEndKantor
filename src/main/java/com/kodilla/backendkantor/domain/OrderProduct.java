package com.kodilla.backendkantor.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "ORDERS_PRODUCTS")
public class OrderProduct {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_PRODUCT_ID", unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @Column(name = "AMOUNT")
    private Double amount;

    public OrderProduct(Order order, Product product, Double amount) {
        this.order = order;
        this.product = product;
        this.amount = amount;
    }
}
