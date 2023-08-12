package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import java.util.logging.Logger;

import com.example.demo.service.PaymentService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class TestController {

    /* @Autowired
    PaymentService paymentService = new PaymentService();  this is dependency injection*/

    /*
     * @Autowired this is also dependency injection using setter
     * public void setPaymentService(PaymentService paymentService) {
     * this.paymentService = paymentService;
     * }
     */

    /* public TestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    } */

    Logger logger = Logger.getLogger(
            TestController.class.getName());

    @GetMapping
    public String sayHi(@RequestParam("username") String username) {
        logger.info("Server say Hi Hi .............{}" + username);
        return "Hi";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String saveHi(@RequestBody UserInput input) {
        logger.info("Server say post ............." + input.toString());
        new PaymentService().persistUser(input);
        return "Post";
    }

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserInput {
        private String username;
        private String password;
        private String firstName;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

    }

    @PutMapping()
    public String put(@RequestBody String input) {
        logger.info("Server say put ............. {}" + input);
        return "Put";
    }

    @DeleteMapping()
    public String delete() {
        logger.info("Server say delete test 234.............");
        return "Delete";
    }
}
