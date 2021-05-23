package com.unisinos.gerenciarsaofrancisco.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Configuration
@EnableWebSecurity
public class DefaultWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    @Resource
    private AuthenticationSuccessHandler authenticationSuccessHandler;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    private DaoAuthenticationProvider authProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/", "/home", "/register/**", "/payment/**").permitAll()
                    .antMatchers("/employee/**").hasRole("EMPLOYEE")
                    .antMatchers("/guest/**").hasRole("GUEST")
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .loginProcessingUrl("/perform_login")
                    .successHandler(authenticationSuccessHandler)
                    .failureUrl("/login?error=true")
                    .permitAll()
                    .and()
                .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout", RequestMethod.GET.toString()))
                    .logoutSuccessUrl("/home")
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID");
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/resources/**");
    }

    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider);
        auth.inMemoryAuthentication()
                .withUser("employee").password(passwordEncoder.encode("employee")).roles("EMPLOYEE")
                .and()
                .withUser("guest").password(passwordEncoder.encode("guest")).roles("GUEST");
    }
}