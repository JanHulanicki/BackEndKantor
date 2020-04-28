package com.kodilla.backendkantor.domain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "PRODUCT_GROUPS")
public class ProductGroup {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODUCT_GROUP_ID", unique = true)
    private Long id;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "productGroup",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Product> products = new ArrayList<>();

    public ProductGroup(String name) {
        this.name = name;
    }
}