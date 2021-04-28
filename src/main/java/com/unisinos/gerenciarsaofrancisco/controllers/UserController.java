package com.unisinos.gerenciarsaofrancisco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = {"/user"})
public class UserController {
    @RequestMapping(value = {"/register"})
    public String register(Model model, @RequestParam(value="error", required=false) boolean error) {
        model.addAttribute("error",error);
        return "register";
    }

    @RequestMapping(value = {"/register/create"})
    public String create(Model model, @RequestParam(value="error", required=false) boolean error) {

        return "login";
    }
}
