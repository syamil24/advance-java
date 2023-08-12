package com.example.javacourse.aggregation;

public class Employee {

    /*
     * this is not inheritance(is a relationship),
     * but this is has a relationship
     */
    int id;
    String name;
    Address address;
    Contact contact;

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 1;
        emp.name = "ABC";

        Address address = new Address();
        address.city = "Seremban";
        address.houseNumber = 344;

        Contact contact = new Contact();
        contact.email = "test@gmail.com";
        contact.phoneNumber = 123459;

        emp.address = address;
        emp.contact = contact;

        System.out.println(emp.address.city);
        System.out.println(emp.address.houseNumber);
        System.out.println(emp.contact.email);
    }
}
