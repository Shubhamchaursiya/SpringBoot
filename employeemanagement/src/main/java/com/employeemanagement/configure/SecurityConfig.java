package com.employeemanagement.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .mvcMatchers("/showNewEmployeeForm").permitAll()
                .mvcMatchers("/saveEmployee").permitAll()
                .mvcMatchers("/").permitAll()
                .mvcMatchers("/deleteEmployee/{id}").permitAll()
                .mvcMatchers("/showFormForUpdate/{id}").permitAll()
                .mvcMatchers("/page/{pageNo}").permitAll()
                .and().formLogin()
                .and().httpBasic();

    }
}
