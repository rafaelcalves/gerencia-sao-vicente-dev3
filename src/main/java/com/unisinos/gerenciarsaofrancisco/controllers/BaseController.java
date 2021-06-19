package com.unisinos.gerenciarsaofrancisco.controllers;

import com.unisinos.gerenciarsaofrancisco.datas.UserData;
import com.unisinos.gerenciarsaofrancisco.models.User;
import com.unisinos.gerenciarsaofrancisco.populators.Populator;
import com.unisinos.gerenciarsaofrancisco.populators.impls.UserDataPopulator;
import com.unisinos.gerenciarsaofrancisco.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

public class BaseController {

    @Resource
    private UserService userService;
    @Resource
    private UserDataPopulator userDataPopulator;

    protected ModelAndView getView(Model model, String path){
        UserData userData = getLoggedUser();

        if (userData!=null) {
            model.addAttribute("logged_user", userData);
        }
        return (new ModelAndView(path,model.asMap()));
    }

    protected UserData getLoggedUser(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            String username = ((UserDetails)principal).getUsername();

            User user = userService.findByEmail(username);
            UserData userData = new UserData();
            userDataPopulator.populate(user,userData);
            return userData;
        }
        return null;
    }
}
