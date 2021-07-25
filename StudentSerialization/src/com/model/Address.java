package com.model;

import java.io.Serializable;

public class Address implements Serializable {
    private String country;
    private String state;
    private String city;
    private Long pinCode; // world largest pin code is 10 digit

    public Address(String country, String state, String city, Long pinCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getCountry() {
        return country;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }
    public Long getPinCode() {
        return pinCode;
    }
}
