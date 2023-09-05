package com.cs50.FinanceApp.controllers;

public class SellRequest {

    // obiekt typu immutable
    private final String symbol;
    private final Integer shares;

    public SellRequest(String symbol, Integer shares) {
        this.symbol = symbol;
        this.shares = shares;
    }

    public String getSymbol() {
        return symbol;
    }

    public Integer getShares() {
        return shares;
    }

    // stworzyć post reque
}
