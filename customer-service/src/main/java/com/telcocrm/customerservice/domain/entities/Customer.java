package com.telcocrm.customerservice.domain.entities;

import com.telcocrm.core.domain.BaseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer extends BaseEntity<UUID> {

    private String customerNumber;
    private List<BillingAccount> billingAccounts = new ArrayList<>();

    public Customer() {
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public List<BillingAccount> getBillingAccounts() {
        return billingAccounts;
    }

    public void setBillingAccounts(List<BillingAccount> billingAccounts) {
        this.billingAccounts = billingAccounts;
    }
}
