package com.unisinos.gerenciarsaofrancisco.controllers;

import com.unisinos.gerenciarsaofrancisco.datas.UserData;
import com.unisinos.gerenciarsaofrancisco.forms.MedicalPrescriptionForm;
import com.unisinos.gerenciarsaofrancisco.models.MedicalPrescription;
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
import java.util.List;


@Controller
@RequestMapping(value ={"/employee/prescription"})
public class PrescriptionController extends BaseController{

    @Resource
    private MedicalPrescriptionService service;

    @RequestMapping(value ={"/",""})
    public ModelAndView prescription(Model model) {
        model.addAttribute("prescription", new MedicalPrescriptionForm());
        return getView(model, "prescription");
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/save"})
    public ModelAndView save(@ModelAttribute("pescribe") MedicalPrescriptionForm medicalPrescriptionForm,
          BindingResult bindingResult, Model model, Errors errors){
        service.saveFromForm(medicalPrescriptionForm);
        return getView(model,"redirect:/employee/prescription/view");
    }

    @RequestMapping(value ={"/view"})
    public ModelAndView view(Model model) {
        UserData loggedUser = getLoggedUser();
        List<MedicalPrescription> medicalPrescriptions = service.getMedicalPrescriptionByDoctorId(loggedUser.getId());
        model.addAttribute("prescriptions", medicalPrescriptions);
        return getView(model, "prescription_view");
    }

}
