package com.kodilla.backendkantor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "USER_ACTIVITY")
public class UserActivity {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACTIVITY_ID")
    private Long activityId;
    @Column(name = "TIME_STAMP")
    private Date created;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    User user;

    @JoinColumn(name = "ACTION_ID", unique = true)
    @ManyToOne (cascade = CascadeType.ALL)
    private ActionType actionType;

    public UserActivity(Date created,User user,ActionType actionType) {
        this.created=created;
        this.user=user;
        this.actionType=actionType;
    }
}
