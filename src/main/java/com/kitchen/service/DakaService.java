package com.kitchen.service;

import com.kitchen.dao.DakaDao;
import com.kitchen.entity.Daka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DakaService {

    @Autowired
    private DakaDao dakaDao;

    public boolean addDaka(int userId, Date recordTime) {
        return dakaDao.addDaka(userId, recordTime);
    }

    public boolean deleteDaka(int userId, Date recordTime) {
        return dakaDao.deleteDaka(userId, recordTime);
    }

    public boolean updateDaka(int userId, Date recordTime) {
        return dakaDao.updateDaka(userId, recordTime);
    }

    public List<Daka> getDakaUserList(int userId) {
        return dakaDao.getDakaUserList(userId);
    }

    public List<Daka> getDakaDateList(Date recordTime) {
        return dakaDao.getDakaDateList(recordTime);
    }

    public List<Daka> getDakaList() {
        return dakaDao.getDakaList();
    }
}
