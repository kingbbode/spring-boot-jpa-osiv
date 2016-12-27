package com.kingbbode.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by YG-MAC on 2016. 12. 25..
 */
@Entity
public class Team {
    @Id
    @GeneratedValue
    private Long idx;

    @Column(nullable = false, length = 20)
    private String name;

    @OneToMany(mappedBy="team")
    private List<Member> members;

    public Long getIdx() {
        return idx;
    }

    public String getName() {
        return name;
    }

    public List<Member> getMembers() {
        return members;
    }
}
