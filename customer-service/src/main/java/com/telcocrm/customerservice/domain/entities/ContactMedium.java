package com.telcocrm.customerservice.domain.entities;

import com.telcocrm.core.domain.BaseEntity;
import com.telcocrm.customerservice.domain.enums.ContactMediumType;

import java.util.UUID;

public class ContactMedium extends BaseEntity<UUID> {

    private UUID customerId;
    private ContactMediumType contactMediumType;
    private String value;
    private boolean primary;
    private Customer customer;

    public ContactMedium() {
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public ContactMediumType getContactMediumType() {
        return contactMediumType;
    }

    public void setContactMediumType(ContactMediumType contactMediumType) {
        this.contactMediumType = contactMediumType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
