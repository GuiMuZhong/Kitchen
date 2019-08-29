package com.kitchen.entity;

public class House {

    private int houseId;

    private String houseName;

    private int houseMaster;

    private double houseArea;

    private String houseNumber;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public int getHouseMaster() {
        return houseMaster;
    }

    public void setHouseMaster(int houseMaster) {
        this.houseMaster = houseMaster;
    }

    public double getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(double houseArea) {
        this.houseArea = houseArea;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseId=" + houseId +
                ", houseName='" + houseName + '\'' +
                ", houseMaster=" + houseMaster +
                ", houseArea=" + houseArea +
                ", houseNumber='" + houseNumber + '\'' +
                '}';
    }
}
