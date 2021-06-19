package com.unisinos.gerenciarsaofrancisco.service.impls;

import com.unisinos.gerenciarsaofrancisco.daos.MedicalPrescriptionDao;
import com.unisinos.gerenciarsaofrancisco.forms.MedicalPrescriptionForm;
import com.unisinos.gerenciarsaofrancisco.models.MedicalPrescription;
import com.unisinos.gerenciarsaofrancisco.populators.impls.MedicalPrescriptionPopulator;
import com.unisinos.gerenciarsaofrancisco.service.MedicalPrescriptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class MedicalPrescriptionServiceImpl implements MedicalPrescriptionService {

    @Resource
    private MedicalPrescriptionDao medicalPrescriptionDao;
    @Resource
    private MedicalPrescriptionPopulator medicalPrescriptionPopulator;

    @Override
    public void saveOrUpdate(MedicalPrescription medicalPrescription)
    {
        medicalPrescriptionDao.saveOrUpdate(medicalPrescription);
    }

    @Override
    public void saveFromForm(MedicalPrescriptionForm medicalPrescriptionForm)
    {
        MedicalPrescription medicalPrescription = new MedicalPrescription();
        medicalPrescriptionPopulator.populate(medicalPrescriptionForm, medicalPrescription);
        saveOrUpdate(medicalPrescription);
    }

    @Override public List<MedicalPrescription> getMedicalPrescriptionByDoctorId(Integer doctorId)
    {
        return medicalPrescriptionDao.findByDoctorId(doctorId);
    }
}
