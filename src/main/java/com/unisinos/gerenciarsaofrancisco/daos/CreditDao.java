package com.unisinos.gerenciarsaofrancisco.daos;

import com.unisinos.gerenciarsaofrancisco.models.Credit;

public interface CreditDao {
    void saveOrUpdate (Credit user);
    Credit findByCard(String card);
    Credit findById(int id);
}

