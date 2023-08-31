package com.cs50.FinanceApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "purchases")
public class Purchases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iD;

    private Integer userId;
    private String symbol;
    private Integer shares;
    private Float price;
    // timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
    // private String transaction_type - "sell" albo "buy"; ENUMERACJA
    // FOREIGN KEY (user_id) REFERENCES users (id)

    // konstruktor bezparametrowy
    public Purchases() {
    }

    public Purchases(Integer userId, String symbol, Integer shares, Float price) {
        this.userId = userId;
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
    }

    public Long getiD() {
        return iD;
    }

    public Integer getUserId() {
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
}
