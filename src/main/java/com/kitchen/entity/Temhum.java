package com.kitchen.entity;

import java.util.Date;

public class Temhum {

    private int houseId;

    private Date recordTime;

    private  double temperature;

    private double humidity;

    public Temhum(int houseId, Date recordTime, double temperature, double humidity) {
        this.houseId = houseId;
        this.recordTime = recordTime;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Temhum{" +
                "houseId=" + houseId +
                ", recordTime=" + recordTime +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
