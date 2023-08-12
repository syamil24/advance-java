package com.maybank.test;

import com.maybank.dto.core.User;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-------------------Container Started-------------------");

        User user = (User) context.getBean("user"); // id of bean
        System.out.println(user);
        System.out.println(user.getName());

        System.out.println("------------SingleTon Test--------------");
        User u2 = (User) context.getBean("u2");
        User u3 = (User) context.getBean("u3");
        System.out.println("u2" + u2);
        System.out.println("u3" + u3);

        System.out.println("------------Prototype Test--------------");

        context.close();

    }

}
