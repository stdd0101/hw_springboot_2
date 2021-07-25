package com.example.demon.exception;

import org.springframework.stereotype.Component;

@Component
public class InvalidCredentials extends RuntimeException {

    public InvalidCredentials(String msg) {
        super(msg);
    }

    public InvalidCredentials() {
    }
}