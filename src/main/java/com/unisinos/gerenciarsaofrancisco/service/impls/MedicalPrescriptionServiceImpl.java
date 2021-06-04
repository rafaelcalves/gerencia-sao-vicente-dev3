package com.unisinos.gerenciarsaofrancisco.service.impls;

import com.unisinos.gerenciarsaofrancisco.daos.MedicalPrescriptionDao;
import com.unisinos.gerenciarsaofrancisco.forms.MedicalPrescriptionForm;
import com.unisinos.gerenciarsaofrancisco.populators.impls.MedicalPrescriptionPopulator;
import com.unisinos.gerenciarsaofrancisco.service.MedicalPrescriptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MedicalPrescriptionServiceImpl implements MedicalPrescriptionService {

    @Resource
    private MedicalPrescriptionDao medicalPrescriptionDao;
    @Resource
    private MedicalPrescriptionPopulator medicalPrescriptionPopulator;
    @Override
    public void saveOrUpdate(MedicalPrescriptionForm medicalPrescription) {
        //TODO:colocar o populate para medicalPrescription e salvar as informaçoes

    }
}
