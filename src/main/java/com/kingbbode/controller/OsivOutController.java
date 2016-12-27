package com.kingbbode.controller;

import com.kingbbode.model.Team;
import com.kingbbode.repository.MemberRepository;
import com.kingbbode.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by YG-MAC on 2016. 12. 27..
 */
@RestController
@RequestMapping("/out")
public class OsivOutController {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/member/{userIdx}")
    public String move(@PathVariable Long userIdx, Team team) {
        memberRepository.findOne(userIdx).moveTeam(team);
        return "redirect:/";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("teams", teamRepository.findAll());
        return "home";
    }
}
