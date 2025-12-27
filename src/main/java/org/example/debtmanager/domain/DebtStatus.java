package org.example.debtmanager.domain;

public enum DebtStatus {
    //enumeration:cst values

    PAID("PAID"),
    UNPAID("UNPAID"),
    CANCELLED("CANCELLED");
    private final String value;

    DebtStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
