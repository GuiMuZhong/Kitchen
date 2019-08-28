package com.kitchen.dao;

import com.kitchen.entity.House;

import java.util.List;

public interface HouseDao  {

    boolean addHouse(String houseName, int houseMaster, double houseArea, String houseNumber);

    boolean deleteHouse(int houseId);

    boolean updateHouse(int houseId, String houseName, int houseMaster, double houseArea, String houseNumber);

    List<House> getHouseList();

}
