package com.unisinos.gerenciarsaofrancisco.service;

import com.unisinos.gerenciarsaofrancisco.forms.CreditDonationForm;
import com.unisinos.gerenciarsaofrancisco.models.Credit;

public interface CreditService {
    void saveOrUpdate (Credit user);
    void saveFromForm(CreditDonationForm user);
    Credit findByCard(String card);
    Credit findById(int id);
}
