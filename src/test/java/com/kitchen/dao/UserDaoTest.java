package com.kitchen.dao;

import com.kitchen.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void getUser() throws Exception{
        String userEmail = "@qq.com";
        System.out.println(userEmail);
        User user= userDao.getUser(userEmail);
        if(user != null)System.out.println(user.toString());
        System.out.println("success");
    }

}
