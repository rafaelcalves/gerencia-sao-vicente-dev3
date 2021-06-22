package com.unisinos.gerenciarsaofrancisco.controllers;

import com.unisinos.gerenciarsaofrancisco.forms.CreditDonationForm;
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
@RequestMapping("/payment")
public class PaymentController extends BaseController{

    @Resource
    private Validator creditFormValidator;

    @Resource
    private CreditService creditService;

    @RequestMapping(value ={"/", ""})
    public ModelAndView payment(Model model) {
        return getView(model, "payment");
    }

    @RequestMapping(value ={"/pix"})
    public ModelAndView pix(Model model) {
        return getView(model, "pix");
    }

    @RequestMapping(value ={"/credit"})
    public ModelAndView creditCard(Model model) {
        CreditDonationForm creditDonationForm = new CreditDonationForm();
        model.addAttribute("credit-card", creditDonationForm);
        return getView(model, "credit");
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/credit/save"})
    public ModelAndView create(@ModelAttribute("credit-card") CreditDonationForm creditDonationForm,
          BindingResult bindingResult, Model model, Errors errors){
        creditFormValidator.validate(creditDonationForm,bindingResult);
        if(bindingResult.hasErrors()){
            return getView(model,"credit");
        }
        model.addAttribute("donation",creditDonationForm);
        return getView(model,"redirect:/payment/credit/donate");
    }

    @RequestMapping(value ={"/credit/donate"})
    public ModelAndView donate(Model model) {
        return getView(model, "donate");
    }
}
