package com.unisinos.gerenciarsaofrancisco.validators;

import com.unisinos.gerenciarsaofrancisco.forms.UserForm;
import com.unisinos.gerenciarsaofrancisco.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.annotation.Resource;


@Component
public class PrescriptionFormValidator implements Validator {
    @Resource
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return UserForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        validateEmpty(errors);
    }

    private void validateEmpty(Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientId", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "medicineId", "field.required");
    }
}
