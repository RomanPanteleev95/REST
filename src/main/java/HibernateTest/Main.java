package HibernateTest;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;


import javax.imageio.spi.ServiceRegistry;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        List<Person> persons = (List<Person>)session.createQuery("from person");

//        List<Person> persons1 = (List<Person>)session.createSQLQuery("select * from person").addScalar("id", Hibernate.INTEGER)
//                .addScalar("name").addScalar("surname")
//                .setResultTransformer(Transformers.aliasToBean(Person.class)).list();

        for (Person p : persons)
            System.out.println(p);
    }

}
