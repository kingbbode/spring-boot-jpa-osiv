package com.kingbbode.model;

import javax.persistence.*;

/**
 * Created by YG-MAC on 2016. 12. 25..
 */
@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long idx;

    @Column(nullable = false, length = 20)
    private String name;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_member_team"))
    private Team team;
}
