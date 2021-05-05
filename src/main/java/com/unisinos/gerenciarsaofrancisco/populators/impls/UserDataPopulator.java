package com.unisinos.gerenciarsaofrancisco.populators.impls;

import com.unisinos.gerenciarsaofrancisco.datas.UserData;
import com.unisinos.gerenciarsaofrancisco.models.User;
import com.unisinos.gerenciarsaofrancisco.populators.Populator;
import org.springframework.stereotype.Component;

@Component
public class UserDataPopulator implements Populator<UserData, User> {

    @Override
    public void populate(UserData source, User target) {
        target.setEmail(source.getEmail());
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());
    }
}
