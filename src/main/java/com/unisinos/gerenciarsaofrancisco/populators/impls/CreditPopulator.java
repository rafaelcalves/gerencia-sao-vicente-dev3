package com.unisinos.gerenciarsaofrancisco.populators.impls;

import com.unisinos.gerenciarsaofrancisco.forms.CreditForm;
import com.unisinos.gerenciarsaofrancisco.models.Credit;
import com.unisinos.gerenciarsaofrancisco.populators.Populator;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CreditPopulator implements Populator<CreditForm, Credit> {
    public static final String DEFAULT_ROLE = "GUEST";
    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public void populate(CreditForm source, Credit target) {
        target.setCvv(source.getCvv());
        target.setOwner(source.getOwner());
        target.setCardNumber(source.getCardNumber());
        target.setCreditCards(source.getCredit_cards());
        
    }
}
