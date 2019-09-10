package com.kitchen.dao;

import com.kitchen.entity.House;
import com.kitchen.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Resource
    private HouseDao houseDao;

    @Test
    public void getUser() {
        String userEmail = "cqw@qq.com";
        System.out.println(userEmail);
        User user= userDao.getUser(userEmail);
        if(user != null)System.out.println(user.toString());
        System.out.println("success");
    }

    @Test
    public void getHouseList() {
        List<House> houses = houseDao.getHouseList();
        for (House house : houses) {
            System.out.println(house);
        }
        System.out.println("success");
    }

}
