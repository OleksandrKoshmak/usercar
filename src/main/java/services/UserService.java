package services;

import dao.UserDao;
import models.User;

import java.util.List;

public class UserService {
    UserDao userDao = new UserDao();

    public UserService() {
    }

    public User findUser(int id) {
        return userDao.findByID(id);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public List<User> findAllUsers() {
        return userDao.findALLByID();
    }

}

