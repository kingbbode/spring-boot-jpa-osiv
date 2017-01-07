package com.kingbbode;

import com.kingbbode.model.Member;
import com.kingbbode.model.Team;
import com.kingbbode.repository.TeamRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJpaOsivApplicationTests {

    @Autowired
    private TeamRepository teamRepository;

    @Test
    @Transactional
    public void 지연_로딩_프록시_테스트() throws Exception {
        System.out.println("teamRepository.findOne(1L)");
        Team team = teamRepository.findOne(1L);
        System.out.println("team.getMembers()");
        List<Member> members = team.getMembers();
        System.out.println("members.iterator()");
        Iterator<Member> membersIterator = members.iterator();
        System.out.println("membersIterator.next()");
        membersIterator.next();
    }
}
