package com.unisinos.gerenciarsaofrancisco.security;

import com.unisinos.gerenciarsaofrancisco.models.User;
import com.unisinos.gerenciarsaofrancisco.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class DefaultUserDetailService implements UserDetailsService {
    public static final String ROLE_PREFIX = "ROLE_";
    @Resource
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        User user = userService.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("No user found with username: " + email);
        }

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(), true, true, true, true,
                getGrantedAuthorities(user.getRole()));
    }

    private List<GrantedAuthority> getGrantedAuthorities(String roles) {
        String[] rolesArray = roles.split(",");
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String role : rolesArray) {
            authorities.add(new SimpleGrantedAuthority(ROLE_PREFIX + role));
        }
        return authorities;
    }
}
