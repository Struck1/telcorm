package com.telcocrm.customerservice.domain.entities;

import com.telcocrm.core.domain.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class District extends BaseEntity<Short> {

    private Short cityId;
    private String name;
    private City city;
    private List<Address> addresses = new ArrayList<>();

    public District() {
    }

    public Short getCityId() {
        return cityId;
    }

    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
