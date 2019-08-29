package com.kitchen.dao;

import com.kitchen.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    boolean addUser(@Param("userName")String userName, @Param("userPassword")String userPassword, @Param("userEmail")String userEmail, @Param("userType")byte userType);

    boolean deleteUser(String userEmail);

    boolean updateUser(@Param("userName")String userName, @Param("userPassword")String userPassword, @Param("userEmail")String userEmail, @Param("userType")byte userType);

    User getUser(@Param("userEmail") String userEmail);

    List<User> getUserTypeList(byte userType);

    List<User> getUserList();

}
