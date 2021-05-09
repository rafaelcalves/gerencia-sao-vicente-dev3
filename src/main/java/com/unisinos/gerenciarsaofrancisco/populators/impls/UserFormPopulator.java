package com.unisinos.gerenciarsaofrancisco.populators.impls;

import com.unisinos.gerenciarsaofrancisco.forms.UserForm;
import com.unisinos.gerenciarsaofrancisco.models.User;
import com.unisinos.gerenciarsaofrancisco.populators.Populator;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserFormPopulator implements Populator<UserForm, User> {
    public static final String DEFAULT_ROLE = "GUEST";
    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public void populate(UserForm source, User target) {
        target.setEmail(source.getEmail());
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());
        target.setPassword(passwordEncoder.encode(source.getPassword()));
        target.setRole(DEFAULT_ROLE);
    }
}
