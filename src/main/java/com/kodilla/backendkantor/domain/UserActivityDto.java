package com.kodilla.backendkantor.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class UserActivityDto {
    private Long activityId;
    private Date created;
    private Long userId;
    private Long actionId;

    public UserActivityDto(Date created,Long userId,Long actionId ) {
        this.created = created;


    }
}
