package com.maybank.test;

import com.maybank.dto.core.Login;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-------------------Container Started-------------------");

        Login login = (Login) context.getBean("Login"); // id of bean
        System.out.println(login);
        System.out.println(login.getUsername() + " " + login.getPassword() + " " + login.getEmail());

        context.close();

    }

}
