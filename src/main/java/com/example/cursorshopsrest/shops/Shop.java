package com.example.cursorshopsrest.shops;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Shop {
    String shopName;
    String id;
    String city;
    String address;
    int stuffNumber;

    public Shop(String shopName, String city, String address, int stuffNumber, boolean siteExists) {
        this.shopName = shopName;
        this.city = city;
        this.address = address;
        this.stuffNumber = stuffNumber;
        this.siteExists = siteExists;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStuffNumber() {
        return stuffNumber;
    }

    public void setStuffNumber(int stuffNumber) {
        this.stuffNumber = stuffNumber;
    }

    public boolean isSiteExists() {
        return siteExists;
    }

    public void setSiteExists(boolean siteExists) {
        this.siteExists = siteExists;
    }

    boolean siteExists;

    @Override
    public String toString() {
        return "Shop{" + "shopName='" + shopName + '\'' + ", id='" + id + '\'' + ", city='" + city + '\'' + ", address='" + address + '\'' + ", stuffNumber=" + stuffNumber + ", siteExists=" + siteExists + '}';
    }
}
