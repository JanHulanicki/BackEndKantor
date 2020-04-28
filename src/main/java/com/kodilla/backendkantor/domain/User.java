package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "USERS")
public class User {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID", unique = true)
    private long id;


    @Column(name = "NICK")
    private String nick;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "E_MAIL")
    private String emailAddress;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @NotNull
    @Column(name = "STATUS")
    private Boolean isBlocked;

    @Column(name = "UUID_KEY")
    private String uuidKey;

    @Column(name = "EXPIRED_DATE")
    private LocalDateTime expiredDate;

    @JoinColumn(name = "CART_ID", unique = true)
    @OneToOne(fetch = FetchType.EAGER)
    public Cart cart;

    @OneToMany(mappedBy = "user", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<UserActivity> userActivities= new ArrayList<>();

    public User(String nick, String password, String emailAddress, String name, String surname, Boolean isBlocked, String uuidKey, LocalDateTime expiredDate) {

        this.nick = nick;
        this.password = password;
        this.emailAddress = emailAddress;
        this.name = name;
        this.surname = surname;
        this.isBlocked = isBlocked;
        this.uuidKey = uuidKey;
        this.expiredDate = expiredDate;
    }
}