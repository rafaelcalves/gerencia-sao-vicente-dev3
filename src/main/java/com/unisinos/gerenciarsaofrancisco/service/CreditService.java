package com.unisinos.gerenciarsaofrancisco.service;

import com.unisinos.gerenciarsaofrancisco.forms.CreditForm;
import com.unisinos.gerenciarsaofrancisco.models.Credit;

public interface CreditService {
    void saveOrUpdate (Credit user);
    void saveFromForm(CreditForm user);
    Credit findByCard(String card);
    Credit findById(int id);
}
