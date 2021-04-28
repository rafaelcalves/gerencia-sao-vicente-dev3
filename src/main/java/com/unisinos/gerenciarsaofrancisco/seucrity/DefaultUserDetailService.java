package com.unisinos.gerenciarsaofrancisco.seucrity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultUserDetailService /*implements UserDetailsService*/ {
//    private Map<String, User> roles = new HashMap<>();
//
//    @PostConstruct
//    public void init() {
//
//        roles.put("employee", new User("employee", "employee", getAuthority("ROLE_EMPLOYEE")));
//        roles.put("guest", new User("guest", "guest", getAuthority("ROLE_GUEST")));
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return roles.get(username);
//    }
//
//    private List<GrantedAuthority> getAuthority(String role) {
//        return Collections.singletonList(new SimpleGrantedAuthority(role));
//    }
}
