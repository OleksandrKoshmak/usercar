package dao;

import models.Auto;
import models.User;

import java.util.List;

public interface AutoDaoInterface {
    Auto findByID(int id);

    void save(Auto auto);

    void update(Auto auto);

    void delete(Auto auto);

    List<Auto> findALL();
}
