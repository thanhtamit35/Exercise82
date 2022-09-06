package com.example.exercise82;

import java.io.Serializable;

public class DataModel implements Serializable {
    private int info;
    private String fullName;
    private String gender;
    private String address;

    public DataModel(int info, String fullName, String gender, String address) {
        this.info = info;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
