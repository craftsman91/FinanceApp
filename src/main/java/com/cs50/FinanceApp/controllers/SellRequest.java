package com.cs50.FinanceApp.controllers;

// analogia do html'owego formularza
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

    // ustawione do testów
    public void setShares(int sharesToSell) {

    }

    //ustawione do testów
    public void setSymbol(String symbol) {

    }
}
