package com.kingbbode.controller;

import com.kingbbode.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by YG-MAC on 2016. 12. 27..
 */
@Controller
public class OsivController {
    private MemberRepository memberRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("members", memberRepository.findAll());
        return "index";
    }
}
