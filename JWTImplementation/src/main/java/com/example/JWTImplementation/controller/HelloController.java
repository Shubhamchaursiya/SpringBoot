package com.example.JWTImplementation.controller;
import com.example.JWTImplementation.model.UserDao;
import com.example.JWTImplementation.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @Autowired
    private JwtUserDetailsService userDetailsService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getEmployees() {
        return "Hello World!";
    }

}