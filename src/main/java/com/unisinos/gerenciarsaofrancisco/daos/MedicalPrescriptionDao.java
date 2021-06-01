package com.unisinos.gerenciarsaofrancisco.daos;

import com.unisinos.gerenciarsaofrancisco.models.MedicalPrescription;


public interface MedicalPrescriptionDao {

    void save(MedicalPrescription medicalPrescription);
    MedicalPrescription findById(Integer id);
}
