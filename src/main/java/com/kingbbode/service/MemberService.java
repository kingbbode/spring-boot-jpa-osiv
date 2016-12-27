package com.kingbbode.service;

import com.kingbbode.model.Team;
import com.kingbbode.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by YG-MAC on 2016. 12. 28..
 */
@Service
@Transactional
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void moveTeam(Long memberIdx, Team team){
        memberRepository.findOne(memberIdx).moveTeam(team);
    }
}
