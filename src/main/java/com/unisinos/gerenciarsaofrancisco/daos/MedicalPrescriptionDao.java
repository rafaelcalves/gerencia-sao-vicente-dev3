package com.unisinos.gerenciarsaofrancisco.daos;

import com.unisinos.gerenciarsaofrancisco.models.MedicalPrescription;

import java.util.List;


public interface MedicalPrescriptionDao {

    void saveOrUpdate(MedicalPrescription medicalPrescription);
    MedicalPrescription findById(Integer id);
    List<MedicalPrescription> findByDoctorId(Integer doctorId);
}
