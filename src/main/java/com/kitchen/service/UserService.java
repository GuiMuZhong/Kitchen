package com.kitchen.service;

import com.kitchen.dao.UserDao;
import com.kitchen.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean addUser(String userName, String userPassword, String userEmail, byte userType) {
        return userDao.addUser(userName, userPassword, userEmail, userType);
    }

    public boolean deleteUser(String userEmail) {
        return userDao.deleteUser(userEmail);
    }

    public boolean updateUser(String userName, String userPassword, String userEmail, byte userType) {
        return userDao.updateUser(userName, userPassword, userEmail, userType);
    }

    public User getUser(String userEmail) {
        return userDao.getUser(userEmail);
    }

    public List<User> getUserTypeList(byte userType) {
        return userDao.getUserTypeList(userType);
    }

    public List<User> getUserList() {
        return userDao.getUserList();
    }

}
