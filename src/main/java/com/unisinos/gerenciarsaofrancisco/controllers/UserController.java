package com.unisinos.gerenciarsaofrancisco.controllers;

import com.unisinos.gerenciarsaofrancisco.forms.UserForm;
import com.unisinos.gerenciarsaofrancisco.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = {"/register"})
public class UserController {
    @Resource
    private Validator userFormValidator;

    @Resource
    private UserService userService;

    @RequestMapping(value = {"/",""})
    public ModelAndView register(Model model) {
        return new ModelAndView("register", "user", new UserForm());
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/add"})
    public String create(@ModelAttribute("user") UserForm userForm,
                         BindingResult bindingResult, Model model, Errors errors){
        userFormValidator.validate(userForm,bindingResult);
        if(bindingResult.hasErrors()){
            return "register";
        }
        userService.saveFromForm(userForm);
        return "redirect:/login";
    }
}
