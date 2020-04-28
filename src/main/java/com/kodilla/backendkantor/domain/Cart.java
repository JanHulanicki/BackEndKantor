package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "CARTS")
public class Cart {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CART_ID")
    private Long cartId;
    @Column(name = "CREATED")
    private Date created;

    public Cart(Date created) {
        this.created = created;
    }

    @JoinColumn(name = "USER_ID", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    //dolozono
    @OneToMany(
            targetEntity = CartProduct.class,
            mappedBy = "cart",
            orphanRemoval = true,
            cascade = CascadeType.PERSIST,
            fetch = FetchType.LAZY//EAGER
    )
    private List<CartProduct> cartProducts = new ArrayList<>();


}

