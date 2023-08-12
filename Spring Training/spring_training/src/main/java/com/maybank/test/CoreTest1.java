package com.maybank.test;

import com.maybank.dto.core.Employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreTest1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml"); // singleton, object
                                                                                                   // already created
        System.out.println("-------------------Container Started & Ready To Use-------------------");

        Employee e1 = (Employee) context.getBean("emp1");
        System.out.println(e1);

        Employee e2 = (Employee) context.getBean("emp1");
        System.out.println(e2);
        context.close();
    }
}
