package com.unisinos.gerenciarsaofrancisco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping(value = {"/login"})
    public String login(Model model, @RequestParam(value="status", required=false) String error) {
        model.addAttribute("status",error);
        return "login";
    }
    @RequestMapping(value = {"/logout"})
    public String logout(Model model, @RequestParam(value="status", required=false) String error) {
        model.addAttribute("status",error);
        return "redirect:home";
    }
}
