package hibernate.main;

import hibernate.model.Wallpaper;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Wallpaper wallpaper = new Wallpaper();
        wallpaper.setId(2);
        wallpaper.setName("Wallp");
        wallpaper.setUrl("//2");

        Transaction tx = session.beginTransaction();
        wallpaper = (Wallpaper)session.get(Wallpaper.class, 1);
        session.delete(wallpaper);
        tx.commit();


        session.close();
    }
}
