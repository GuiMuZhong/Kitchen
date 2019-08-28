package com.kitchen.entity;

import java.util.Date;

public class Daka {

    private  int userId;

    private Date recordTime;

    public Daka(int userId, Date recordTime) {
        this.userId = userId;
        this.recordTime = recordTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        return "Daka{" +
                "userId=" + userId +
                ", recordTime=" + recordTime +
                '}';
    }
}
