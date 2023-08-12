package com.maybank.test;

import com.maybank.dao.Login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_Login {

    public static void main(String[] args) {

        Login login = new Login();
        login.setUsername("Syamil 2");
        login.setPassword("password");
        login.setEmail("Test Email");
        login.setPhoneNumber(123456);

        Configuration configuration = new Configuration().configure();
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();
        session.persist(login);
        session.getTransaction().commit();

        session.close();
        sf.close();

    }
}
