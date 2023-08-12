package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Test1.1", "Test2", "Test3");

        // s1.setId(3);
        s1.setFirstName("Ahmad 3");
        s1.setLastName("Syamil 3");
        s1.setCity("Seremban 3");

        Configuration config = new Configuration().configure();
        SessionFactory sf = config.buildSessionFactory();

        Session session = sf.openSession();
        session.beginTransaction();

        session.persist(s1);

        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}
