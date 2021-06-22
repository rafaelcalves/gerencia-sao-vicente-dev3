package com.unisinos.gerenciarsaofrancisco.validators;

import com.unisinos.gerenciarsaofrancisco.forms.CreditDonationForm;
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
        return CreditDonationForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        CreditDonationForm form = (CreditDonationForm)o;
        validateEmpty(errors);
        if(((CreditDonationForm) o).getValue() <= 0){
            errors.rejectValue("value", "invalid");
        }
    }

    private void validateEmpty(Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "number", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cvv", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "expirationMonth", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "expirationYear", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "value", "field.required");
    }
}
