package com.kitchen.dao;

import com.kitchen.entity.Temhum;

import java.util.Date;
import java.util.List;

public interface TemhumDao {

    boolean addTemhum(int houseId, Date recordTime, double temperature, double humidity);

    boolean deleteTemhum(int houseId, Date recordTime);

    boolean updateTemhum(int houseId, Date recordTime, double temperature, double humidity);

    List<Temhum> getTemhumList();

    List<Temhum> getTemhumHouseList(int houseId);

    List<Temhum> getTemhumDateList(Date recordTime);

}
