package com.unisinos.gerenciarsaofrancisco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController{
    @RequestMapping(value = {"/login"})
    public ModelAndView login(Model model, @RequestParam(value="error", required=false) boolean error) {
        model.addAttribute("error",error);
        return getView(model,"login");
    }
}
