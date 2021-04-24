package com.unisinos.gerenciarsaofrancisco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value ={"/",})
public class HomeController {
    @RequestMapping(value ={"/home","/"})
    public String home(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "home";
    }

    @RequestMapping(value ={"/employee/home"})
    public String employeeHome(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "employee_home";
    }

    @RequestMapping(value ={"/guest/home"})
    public String guestHome(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "guest_home";
    }
}
