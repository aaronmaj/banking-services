package com.banking.core.dto.account;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountType {
    CHECKING("Checking"),
    SAVINGS("Savings"),
    FIXED_DEPOSIT("Fixed Deposit"),
    RECURRING_DEPOSIT("Recurring Deposit"),
    LOAN("Loan"),
    CERTIFICATE_OF_DEPOSIT("Certificate of deposit");

    private final String value;


    AccountType(String value) {
        this.value = value;
    }
    @JsonValue
    public String getValue() {
        return value;
    }
}
