package com.unisinos.gerenciarsaofrancisco.service.impls;

import com.unisinos.gerenciarsaofrancisco.daos.UserDao;
import com.unisinos.gerenciarsaofrancisco.forms.UserForm;
import com.unisinos.gerenciarsaofrancisco.models.User;
import com.unisinos.gerenciarsaofrancisco.populators.impls.UserPopulator;
import com.unisinos.gerenciarsaofrancisco.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DefaultUserService implements UserService {

    @Resource
    private UserDao userDao;
    @Resource
    private UserPopulator userPopulator;

    @Override
    public void saveOrUpdate(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    public void saveFromForm(UserForm userForm) {
        User user = new User();
        userPopulator.populate(userForm,user);
        saveOrUpdate(user);
    }
}
