package org.example.debtmanager.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "debt")
public class Debt {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "currency")
    private String currency;
    @Column(name = "created_on")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime createdOn;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private DebtStatus status;
    @Column(name = "paid_on")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime paidOn;
    @Column(name = "description")
    private String description;
    @Column(name = "customer_id")
    private Integer customerId;

    public Debt() {

    }

    public Debt(Integer id, Integer amount, String currency, LocalDateTime createdOn, DebtStatus status, LocalDateTime paidOn, String description, Integer customerId) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.createdOn = createdOn;
        this.status = status;
        this.paidOn = paidOn;
        this.description = description;
        this.customerId = customerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public DebtStatus getStatus() {
        return status;
    }

    public void setStatus(DebtStatus status) {
        this.status = status;
    }

    public LocalDateTime getPaidOn() {
        return paidOn;
    }

    public void setPaidOn(LocalDateTime paidOn) {
        this.paidOn = paidOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}


