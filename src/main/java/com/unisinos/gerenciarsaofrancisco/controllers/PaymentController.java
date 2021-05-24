package com.unisinos.gerenciarsaofrancisco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentController extends BaseController{
    @RequestMapping(value ={"/payment"})
    public ModelAndView payment(Model model) {
        return getView(model, "payment");
    }

    @RequestMapping(value ={"/payment/pix"})
    public ModelAndView pix(Model model) {
        return getView(model, "pix");
    }
}
