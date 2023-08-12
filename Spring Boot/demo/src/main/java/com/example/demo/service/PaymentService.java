package com.example.demo.service;

import java.util.logging.Logger;

import com.example.demo.controller.TestController.UserInput;

public class PaymentService {

    Logger logger = Logger.getLogger(
            PaymentService.class.getName());

    public void persistUser(UserInput input) {
        if (input.getUsername() == null && input.getUsername().length() >= 0) {
            logger.info("persist to db");
            return;
        }
        throw new IllegalArgumentException("Username is mandatory");
    }
}
