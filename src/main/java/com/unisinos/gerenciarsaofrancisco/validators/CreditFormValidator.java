package com.unisinos.gerenciarsaofrancisco.validators;

import com.unisinos.gerenciarsaofrancisco.forms.CreditForm;
import com.unisinos.gerenciarsaofrancisco.service.CreditService;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.annotation.Resource;

@Component
public class CreditFormValidator implements Validator {
    @Resource
    private CreditService creditService;

    @Override
    public boolean supports(Class<?> aClass) {
        return CreditForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        CreditForm credit = (CreditForm) o;
        validateEmpty(errors);


        if(creditService.findByCard(credit.getCardNumber()) != null){
            errors.rejectValue("CardNumber", "duplicated");
        }
    }

    private void validateEmpty(Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "card Number", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "owner", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cvv", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "credit_cards", "field.required");
    }
}
