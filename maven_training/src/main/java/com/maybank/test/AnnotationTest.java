package com.maybank.test;

import com.maybank.dao.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AnnotationTest {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Test Name 8");

        Configuration configuration = new Configuration().configure();
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();

        session.close();
        sf.close();

    }
}
