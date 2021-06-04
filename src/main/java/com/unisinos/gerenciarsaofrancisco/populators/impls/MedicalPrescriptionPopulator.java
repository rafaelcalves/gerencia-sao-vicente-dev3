package com.unisinos.gerenciarsaofrancisco.populators.impls;

import com.unisinos.gerenciarsaofrancisco.forms.MedicalPrescriptionForm;
import com.unisinos.gerenciarsaofrancisco.models.MedicalPrescription;
import com.unisinos.gerenciarsaofrancisco.populators.Populator;
import org.springframework.stereotype.Component;

@Component
public class MedicalPrescriptionPopulator implements Populator<MedicalPrescriptionForm,MedicalPrescription> {
    @Override
    public void populate(MedicalPrescriptionForm source, MedicalPrescription target) {
        //TODO:criar popolete depois de validar os campos do front
    }
}
