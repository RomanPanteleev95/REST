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
        session.save(wallpaper);
        tx.commit();

        List<Wallpaper> list = (List<Wallpaper>) session.createQuery("from hibernate.model.Wallpaper").list();

        for (Wallpaper w : list)
            System.out.println(w);

        session.close();
    }
}
