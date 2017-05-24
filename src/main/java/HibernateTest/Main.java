package HibernateTest;


import dao.PersonDao;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.imageio.spi.ServiceRegistry;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        List<Person> persons = (List<Person>)session.createQuery("from Person").list();
//
////        List<Person> persons1 = (List<Person>)session.createSQLQuery("select * from person").addScalar("id", Hibernate.INTEGER)
////                .addScalar("name").addScalar("surname")
////                .setResultTransformer(Transformers.aliasToBean(Person.class)).list();
//
//        for (Person p : persons)
//            System.out.println(p);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        PersonDao personDao = context.getBean(PersonDao.class);

        Person person = new Person();
        person.setId(2);
        person.setName("Alexey");
        person.setSurname("Berezin");
        personDao.save(person);

        List<Person> list = personDao.list();

        for (Person p : list)
            System.out.println(p);

        context.close();

    }

}
