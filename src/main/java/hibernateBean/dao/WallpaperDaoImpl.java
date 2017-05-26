package hibernateBean.dao;

import hibernateBean.model.Wallpaper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public class WallpaperDaoImpl implements WallpaperDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Wallpaper wallpaper) {
        Session session = sessionFactory.openSession();
//        Transaction tx = session.beginTransaction();
        session.persist(wallpaper);
//        tx.commit();
        session.close();
    }

    public List<Wallpaper> list() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        return sessionFactory.getCurrentSession().createQuery("from hibernateBean.model.Wallpaper").list();
    }

    public void remove(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Wallpaper wallpaper = (Wallpaper) session.get(Wallpaper.class, id);
        if (wallpaper != null)
            session.delete(wallpaper);
        session.close();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
