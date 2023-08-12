package com.maybank.test;

import com.maybank.dto.di.Student;
import com.maybank.dto.di.Laptop;
import com.maybank.dto.di.Mouse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyPractice {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("dipractice.xml");

        Student student = (Student) container.getBean("student");

        System.out.println("Company name " + student.getName());

        Laptop laptop = student.getLaptop();
        if (laptop != null) {
            System.out.println("Laptop brand " + laptop.getBrand());
            System.out.println("Laptop mouse model " + laptop.getMouse());
        }

        container.close();

    }

}
