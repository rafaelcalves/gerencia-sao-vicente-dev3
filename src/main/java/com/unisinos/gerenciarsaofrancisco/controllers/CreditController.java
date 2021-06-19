package com.unisinos.gerenciarsaofrancisco.controllers;

import com.unisinos.gerenciarsaofrancisco.forms.CreditForm;
import com.unisinos.gerenciarsaofrancisco.service.CreditService;
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
public class CreditController extends BaseController{
    @Resource
    private Validator creValidator;

    @Resource
    private CreditService creditService;

    @RequestMapping(method = RequestMethod.POST, value = {"/Salvar"})
    public ModelAndView create(@ModelAttribute("user") CreditForm creditForm,
                               BindingResult bindingResult, Model model, Errors errors){
        creValidator.validate(creditForm,bindingResult);
        if(bindingResult.hasErrors()){
            return getView(model,"home");
        }
        creditService.saveFromForm(creditForm);
        return getView(model,"redirect:/login");
    }
}
