package com.kitchen.dao;

import com.kitchen.entity.Daka;

import java.util.Date;
import java.util.List;

public interface DakaDao {

    boolean addDaka(int userId, Date recordTime);

    boolean deleteDaka(int userId, Date recordTime);

    boolean updateDaka(int userId, Date recordTime);

    List<Daka> getDakaUserList(int userId);

    List<Daka> getDakaDateList(Date recordTime);

    List<Daka> getDakaList();

}
