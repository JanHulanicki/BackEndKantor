package com.kodilla.backendkantor.domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;
    private String nick;
    private String password;
    private String emailAddress;
    private String name;
    private String surname;
    private Boolean isBlocked;
    private String uuidKey;
    private LocalDateTime expiredDate;
}