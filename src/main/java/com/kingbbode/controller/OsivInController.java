package com.kingbbode.controller;

import com.kingbbode.model.Team;
import com.kingbbode.service.MemberService;
import com.kingbbode.service.TeamService;
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
@RequestMapping("/in")
public class OsivInController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private TeamService teamService;

    @PostMapping("/member/{memberIdx}")
    public String move(@PathVariable Long memberIdx, Team team){
        memberService.moveTeam(memberIdx, team);
        return "redirect:/";
    }

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("teams", teamService.findAll());
        return "home";
    }
}
