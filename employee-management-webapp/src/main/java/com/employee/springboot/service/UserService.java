package com.employee.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.employee.springboot.dto.UserRegistrationDto;
import com.employee.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
