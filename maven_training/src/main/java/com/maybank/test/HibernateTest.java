package com.maybank.test;

import com.maybank.dao.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(4);
        emp.setName("Ahmad 2");
        emp.setDesignation("Nexter 2");
        emp.setAddress("Seremban 2");

        Configuration configuration = new Configuration().configure();
        SessionFactory sf = configuration.buildSessionFactory();
        // saveEmployee(sf, emp);
        getEmployee(sf, emp);
        sf.close();
    }

    public static void getEmployee(SessionFactory sf, Employee emp) {
        Session session = sf.openSession();
        Employee savedEmployee = session.get(Employee.class, emp.getId());
        System.out.println(savedEmployee.getName() + " " + savedEmployee.getAddress() + " "
                + savedEmployee.getDesignation() + " " + savedEmployee.getId());
        session.close();
    }

    public static void saveEmployee(SessionFactory sf, Employee emp) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.persist(emp); // insert into emp values......
        session.getTransaction().commit();
        session.close();

    }
}
