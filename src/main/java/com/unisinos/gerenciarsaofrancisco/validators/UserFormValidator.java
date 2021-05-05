package com.unisinos.gerenciarsaofrancisco.validators;

import com.unisinos.gerenciarsaofrancisco.forms.UserForm;
import com.unisinos.gerenciarsaofrancisco.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.annotation.Resource;

@Component
public class UserFormValidator implements Validator {
    @Resource
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return UserForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        UserForm user = (UserForm) o;
        if(!user.getPassword().equals(user.getConfirmPassword())) {
            errors.rejectValue("confirmPassword", "user.error.samePasswords");
        }

        if(userService.findByEmail(user.getEmail()) != null){
            errors.rejectValue("email", "user.error.duplicatedEmail");
        }
    }
}
