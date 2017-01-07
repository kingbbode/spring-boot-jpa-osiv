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

    @OneToMany(mappedBy="team", fetch = FetchType.LAZY)
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

    public Long getReverseIdx(){
        return this.idx==1?2L:1;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }
}
