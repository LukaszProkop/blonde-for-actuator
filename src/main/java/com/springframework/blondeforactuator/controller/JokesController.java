package com.springframework.blondeforactuator.controller;

import com.springframework.blondeforactuator.service.BlondeQuotImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private BlondeQuotImpl blondeQuot;

    public JokesController(BlondeQuotImpl blondeQuot) {
        this.blondeQuot = blondeQuot;
    }

    @GetMapping("")
    public String showJoke(Model model) {
        model.addAttribute("joke", blondeQuot.getRandomQuote());
        return "blonde";
    }
}
