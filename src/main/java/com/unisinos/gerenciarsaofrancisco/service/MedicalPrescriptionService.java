package com.unisinos.gerenciarsaofrancisco.service;

import com.unisinos.gerenciarsaofrancisco.forms.MedicalPrescriptionForm;

public interface MedicalPrescriptionService {
    void saveOrUpdate(MedicalPrescriptionForm medicalPrescription);
}
