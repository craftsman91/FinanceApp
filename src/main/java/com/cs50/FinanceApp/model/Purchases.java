package com.cs50.FinanceApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "purchases")
public class Purchases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iD;

    @Column(name = "user_id", insertable = false, updatable = false)
    private Long userId;
    private String symbol;
    private Integer shares;
    private Float price;
    // timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType; // Dodaj pole transactionType


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // konstruktor bezparametrowy
    public Purchases() {
    }

    public Purchases(Long userId, String symbol, Integer shares, Float price, TransactionType transactionType) {
        this.userId = userId;
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
        this.transactionType = transactionType;
    }

    public Long getiD() {
        return iD;
    }

    public Long getUserId() {
        return userId;
    }

    public String getSymbol() {
        return symbol;
    }

    public Integer getShares() {
        return shares;
    }

    public Float getPrice() {
        return price;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

}
