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


@NoArgsConstructor
@Getter
@Setter
@Entity(name = "ACTION_TYPE")
public class ActionType {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACTION_ID")
    private Long actionId;
    @Column(name = "ACTIVITY")
    private String activityType;
    @Column(name = "TABLE")
    private String table;
    @OneToMany(mappedBy = "action_type", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<UserActivity> userActivities = new ArrayList<>();

    public ActionType(String activityType,  String table) {
        this.activityType=activityType;
        this.table=table;
    }

}
