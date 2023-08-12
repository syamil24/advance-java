package com.maybank.test;

import com.maybank.dao.Person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Native ID Name 2");

        Configuration configuration = new Configuration().configure();
        SessionFactory sf = configuration.buildSessionFactory();
        saveEmployee(sf, person);
        // getEmployee(sf, person);
        sf.close();
    }

    public static void getEmployee(SessionFactory sf, Person person) {
        Session session = sf.openSession();
        Person savedPerson = session.get(Person.class, person.getId());
        System.out.println(savedPerson.getName() + savedPerson.getId());
        session.close();
    }

    public static void saveEmployee(SessionFactory sf, Person person) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.persist(person); // insert into emp values......
        session.getTransaction().commit();
        session.close();

    }
}
