package com.unisinos.gerenciarsaofrancisco.service;

import com.unisinos.gerenciarsaofrancisco.forms.MedicalPrescriptionForm;
import com.unisinos.gerenciarsaofrancisco.models.MedicalPrescription;

import java.util.List;


public interface MedicalPrescriptionService {
    void saveOrUpdate(MedicalPrescription medicalPrescription);
    void saveFromForm(MedicalPrescriptionForm medicalPrescription);
    List<MedicalPrescription> getMedicalPrescriptionByDoctorId(Integer doctorId);
}
