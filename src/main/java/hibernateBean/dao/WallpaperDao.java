package hibernateBean.dao;

import hibernateBean.model.Wallpaper;

import java.util.List;

public interface WallpaperDao {
    public void save(Wallpaper wallpaper);
    public List<Wallpaper> list();
    public void remove(int id);
}
