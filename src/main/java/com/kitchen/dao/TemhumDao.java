package com.kitchen.dao;

import com.kitchen.entity.Temhum;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TemhumDao {

    boolean addTemhum(@Param("houseId") int houseId, @Param("recordTime") Date recordTime, @Param("temperature") double temperature, @Param("humidity") double humidity);

    boolean deleteTemhum(@Param("houseId") int houseId, @Param("recordTime") Date recordTime);

    boolean updateTemhum(@Param("houseId") int houseId, @Param("recordTime") Date recordTime, @Param("temperature") double temperature, @Param("humidity") double humidity);

    List<Temhum> getTemhumList();

    List<Temhum> getTemhumHouseList(int houseId);

    List<Temhum> getTemhumDateList(@Param("houseId") int houseId, @Param("recordTime") Date recordTime);

}
