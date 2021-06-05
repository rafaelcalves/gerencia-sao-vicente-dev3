package com.unisinos.gerenciarsaofrancisco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrescriptionController extends BaseController{
    @RequestMapping(value ={"/employee/prescription"})
    public ModelAndView prescription(Model model) {
        return getView(model, "prescription");
    }
}
