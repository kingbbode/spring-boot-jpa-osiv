package com.kingbbode.controller;

import com.kingbbode.model.Team;
import com.kingbbode.repository.MemberRepository;
import com.kingbbode.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by YG-MAC on 2016. 12. 27..
 */
@Controller
@RequestMapping("/out")
public class OsivOutController {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/member/{memberIdx}")
    public String move(@PathVariable Long memberIdx, Team team) {
        memberRepository.findOne(memberIdx).moveTeam(team);
        return "redirect:/";
    }

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("teams", teamRepository.findAll());
        return "home";
    }
}
