package services;

import dao.AutoDao;
import models.Auto;
import models.User;

import java.util.List;

public class AutoService {
    AutoDao autoDao = new AutoDao();


    public Auto findAuto(int id) {
        return autoDao.findByID(id);
    }

    public void saveAuto(Auto auto) {
        autoDao.save(auto);
    }

    public void deleteAuto(Auto auto) {
        autoDao.delete(auto);
    }

    public void updateAuto(Auto auto) {
        updateAuto(auto);
    }

    public List<Auto> findAllAuto() {
        return autoDao.findALL();
    }

}




