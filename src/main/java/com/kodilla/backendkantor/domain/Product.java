package com.kodilla.backendkantor.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "PRODUCTS")
public class Product {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODUCT_ID", unique = true)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_GROUP_ID")
    private ProductGroup productGroup;

    @OneToMany(mappedBy = "product", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<OrderProduct> ordersProducts = new ArrayList<>();

    public Product(String name, String description, BigDecimal price, ProductGroup productGroup) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.productGroup = productGroup;
    }


}
