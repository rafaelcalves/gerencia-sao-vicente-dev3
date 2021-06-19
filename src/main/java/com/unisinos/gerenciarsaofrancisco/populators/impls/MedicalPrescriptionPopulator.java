package com.unisinos.gerenciarsaofrancisco.populators.impls;

import com.unisinos.gerenciarsaofrancisco.forms.MedicalPrescriptionForm;
import com.unisinos.gerenciarsaofrancisco.models.MedicalPrescription;
import com.unisinos.gerenciarsaofrancisco.models.User;
import com.unisinos.gerenciarsaofrancisco.populators.Populator;
import com.unisinos.gerenciarsaofrancisco.service.MedicationService;
import com.unisinos.gerenciarsaofrancisco.service.PatientService;
import com.unisinos.gerenciarsaofrancisco.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class MedicalPrescriptionPopulator implements Populator<MedicalPrescriptionForm,MedicalPrescription> {
    @Resource
    private UserService userService;

    @Resource
    private MedicationService medicationService;

    @Resource
    private PatientService patientService;

    @Override
    public void populate(MedicalPrescriptionForm source, MedicalPrescription target) {
        User doctor = userService.findById(source.getDoctorId());
        target.setDoctor(doctor);
        String patient = patientService.findById(source.getPatientId());
        target.setPatient(patient);
        String medication = medicationService.findById(source.getMedicineId());
        target.setMedicine(medication);
        target.setDescription(source.getDescription());
        target.setStartDate(source.getStartDate());
        target.setEndDate(source.getEndDate());
    }
}
