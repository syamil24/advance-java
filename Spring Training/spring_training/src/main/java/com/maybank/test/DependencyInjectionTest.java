package com.maybank.test;

import com.maybank.dto.di.Address;
import com.maybank.dto.di.Company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("di.xml");

        Company company = (Company) context.getBean("company");

        System.out.println("Company name " + company.getName());

        Address address = company.getAddress();
        if (address != null) {
            System.out.println("Address " + address.getCity());
            System.out.println("Street " + address.getStreet());
        }

        context.close();

    }

}
