package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActionTypeDto {
    private Long actionId;
    private String activityType;
    private String table;
    public ActionTypeDto(String activityType,  String table) {
        this.activityType=activityType;
        this.table=table;
    }
}
