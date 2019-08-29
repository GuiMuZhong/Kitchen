package com.kitchen.service;

import com.kitchen.dao.HouseDao;
import com.kitchen.entity.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    @Autowired
    private HouseDao houseDao;

    public boolean addHouse(String houseName, int houseMaster, double houseArea, String houseNumber) {
        return houseDao.addHouse(houseName, houseMaster, houseArea, houseNumber);
    }

    public boolean deleteHouse(int houseId) {
        return houseDao.deleteHouse(houseId);
    }

    public boolean updateHouse(int houseId, String houseName, int houseMaster, double houseArea, String houseNumber) {
        return houseDao.updateHouse(houseId, houseName, houseMaster, houseArea, houseNumber);
    }

    public List<House> getHouseList() {
        return houseDao.getHouseList();
    }

}
