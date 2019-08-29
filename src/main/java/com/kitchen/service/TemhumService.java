package com.kitchen.service;

import com.kitchen.dao.TemhumDao;
import com.kitchen.entity.Temhum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TemhumService {

    @Autowired
    private TemhumDao temhumDao;

    public boolean addTemhum(int houseId, Date recordTime, double temperature, double humidity) {
        return temhumDao.addTemhum(houseId, recordTime, temperature, humidity);
    }

    public boolean deleteTemhum(int houseId, Date recordTime) {
        return temhumDao.deleteTemhum(houseId, recordTime);
    }

    public boolean updateTemhum(int houseId, Date recordTime, double temperature, double humidity) {
        return temhumDao.updateTemhum(houseId, recordTime, temperature, humidity);
    }

    public List<Temhum> getTemhumList() {
        return temhumDao.getTemhumList();
    }

    public List<Temhum> getTemhumHouseList(int houseId) {
        return temhumDao.getTemhumHouseList(houseId);
    }

}
