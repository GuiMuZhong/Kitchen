package com.kitchen.dao;

import com.kitchen.entity.Daka;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface DakaDao {

    boolean addDaka(@Param("userId") int userId, @Param("recordTime") Date recordTime);

    boolean deleteDaka(@Param("userId") int userId, @Param("recordTime") Date recordTime);

    boolean updateDaka(@Param("userId") int userId, @Param("recordTime") Date recordTime);

    List<Daka> getDakaUserList(int userId);

    List<Daka> getDakaDateList(Date recordTime);

    List<Daka> getDakaList();

}
