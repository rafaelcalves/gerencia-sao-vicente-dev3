package com.unisinos.gerenciarsaofrancisco.controllers;

import com.unisinos.gerenciarsaofrancisco.forms.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value ={"/",})
public class HomeController extends BaseController{
    @RequestMapping(value ={"/home","/"})
    public ModelAndView home(Model model) {
        model.addAttribute("user", new UserForm());
        return getView(model, "home");
    }

    @RequestMapping(value ={"/employee/home"})
    public ModelAndView employeeHome(Model model) {
        return getView(model, "employee_home");
    }

    @RequestMapping(value ={"/guest/home"})
    public ModelAndView guestHome(Model model) {
        return getView(model, "guest_home");
    }
}
