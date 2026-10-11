package com.telcocrm.customerservice.domain.entities;

import com.telcocrm.core.domain.BaseEntity;
import com.telcocrm.customerservice.domain.enums.BillingAccountStatus;
import com.telcocrm.customerservice.domain.enums.BillingAccountType;

import java.util.UUID;

public class BillingAccount extends BaseEntity<UUID> {

    private UUID customerId;
    private UUID billingAddressId;
    private String name;
    private String number;
    private String description;
    private BillingAccountType billingAccountType;
    private BillingAccountStatus billingAccountStatus;
    private Customer customer;
    private Address billingAddress;

    public BillingAccount() {
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public UUID getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(UUID billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BillingAccountType getBillingAccountType() {
        return billingAccountType;
    }

    public void setBillingAccountType(BillingAccountType billingAccountType) {
        this.billingAccountType = billingAccountType;
    }

    public BillingAccountStatus getBillingAccountStatus() {
        return billingAccountStatus;
    }

    public void setBillingAccountStatus(BillingAccountStatus billingAccountStatus) {
        this.billingAccountStatus = billingAccountStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
