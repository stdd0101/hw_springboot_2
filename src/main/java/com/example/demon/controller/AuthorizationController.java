package com.example.demon.controller;

import com.example.demon.exception.InvalidCredentials;
import com.example.demon.exception.UnauthorizedUser;
import com.example.demon.model.Authorities;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.demon.service.AuthorizationService;

import java.util.List;

@RestController
@RequestMapping("/")

public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
       return service.getAuthorities(user, password);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidCredentials.class)
    String handleInvalidCredentials(InvalidCredentials exception) {
        return exception.getMessage();
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedUser.class)
    String unauthorizedUser(UnauthorizedUser exception) {
        return exception.getMessage();
    }
}