package com.unisinos.gerenciarsaofrancisco.controllers;

import com.unisinos.gerenciarsaofrancisco.forms.MedicalPrescriptionForm;
import com.unisinos.gerenciarsaofrancisco.service.MedicalPrescriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = {"/"})
public class PrescribeMedicineController extends BaseController {

    @Resource
    private MedicalPrescriptionService service;

    @RequestMapping(method = RequestMethod.POST, value = {"prescribeMedicine/save"})
    public ModelAndView save(@ModelAttribute("pescribe") MedicalPrescriptionForm medicalPrescriptionForm,
                             BindingResult bindingResult, Model model, Errors errors){
        service.saveOrUpdate(medicalPrescriptionForm);
        return getView(model,"redirect:/prescription");
    }

}
