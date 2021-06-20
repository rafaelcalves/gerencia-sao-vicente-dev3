package com.unisinos.gerenciarsaofrancisco.populators.impls;

import com.unisinos.gerenciarsaofrancisco.forms.CreditDonationForm;
import com.unisinos.gerenciarsaofrancisco.models.Credit;
import com.unisinos.gerenciarsaofrancisco.populators.Populator;
import org.springframework.stereotype.Component;


@Component
public class CreditPopulator implements Populator<CreditDonationForm, Credit> {
    @Override
    public void populate(CreditDonationForm source, Credit target) {
        target.setCvv(source.getCvv());
        target.setOwner(source.getName());
        target.setCardNumber(source.getNumber());
    }
}
