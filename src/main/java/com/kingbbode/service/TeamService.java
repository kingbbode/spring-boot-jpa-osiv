package com.kingbbode.service;

import com.kingbbode.model.Team;
import com.kingbbode.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by YG-MAC on 2016. 12. 28..
 */
@Service
@Transactional
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> findAll(){
        List<Team> teams = teamRepository.findAll();
        teams.stream().forEach(team->team.getMembers().iterator().next());
        return teams;
    }
}
