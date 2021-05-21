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
@RequestMapping(value = {"/"})
public class UserController extends BaseController{
    @Resource
    private Validator userFormValidator;

    @Resource
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = {"/register"})
    public ModelAndView create(@ModelAttribute("user") UserForm userForm,
                               BindingResult bindingResult, Model model, Errors errors){
        userFormValidator.validate(userForm,bindingResult);
        if(bindingResult.hasErrors()){
            return getView(model,"home");
        }
        userService.saveFromForm(userForm);
        return getView(model,"redirect:/login");
    }
}
