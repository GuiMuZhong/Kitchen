package com.kitchen.dao;

import com.kitchen.entity.House;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseDao {

    boolean addHouse(@Param("houseName") String houseName, @Param("houseMaster") int houseMaster, @Param("houseArea") double houseArea, @Param("houseNumber") String houseNumber);

    boolean deleteHouse(int houseId);

    boolean updateHouse(@Param("houseId") int houseId, @Param("houseName") String houseName, @Param("houseMaster") int houseMaster, @Param("houseArea") double houseArea, @Param("houseNumber") String houseNumber);

    List<House> getHouseList();

}
