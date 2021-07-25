package com.example.demon.config;

import com.example.demon.controller.AuthorizationController;
import com.example.demon.repository.UserRepository;
import com.example.demon.service.AuthorizationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages = "com.example.demon")
@Configuration

public class JavaConfig {
//    @Bean
//    public AuthorizationController authorizationController() {
//        return new AuthorizationController();
//    }
//
    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public AuthorizationService authorizationService() {
        return new AuthorizationService();
    }
}