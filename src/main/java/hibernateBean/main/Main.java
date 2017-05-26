package hibernateBean.main;


import hibernateBean.dao.WallpaperDao;
import hibernateBean.model.Wallpaper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfigForHibenateBean.xml");
            WallpaperDao wallpaperDao = context.getBean(WallpaperDao.class);

            Wallpaper wallpaper = new Wallpaper();

            wallpaper.setId(1);
            wallpaper.setName("someName");
            wallpaper.setUrl("someURL");
            wallpaperDao.save(wallpaper);
//        wallpaperDao.remove(1);
        context.close();


    }
}
