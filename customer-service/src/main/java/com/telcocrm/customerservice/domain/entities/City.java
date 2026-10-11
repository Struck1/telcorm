package com.telcocrm.customerservice.domain.entities;

import com.telcocrm.core.domain.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class City extends BaseEntity<Short> {

    private String name;
    private List<District> districts = new ArrayList<>();

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
