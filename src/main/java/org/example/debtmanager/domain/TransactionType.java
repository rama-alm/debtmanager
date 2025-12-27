package org.example.debtmanager.domain;

public enum TransactionType {
    REFUND("REFUND"),
    FULL_PAYMENT("FULL_PAYMENT"),
    PARTIAL_PAYMENT("PARTIAL_PAYMENT");
    private final String value;

    TransactionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
