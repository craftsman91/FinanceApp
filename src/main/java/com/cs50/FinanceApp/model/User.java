package com.cs50.FinanceApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String hash;
    private Float cash;

    // lista purchases "one to many" private List purchases...

    // konstruktor bezparametrowy obsługiwany przez hibernate
    public User() {
    }

    public User(String username, String hash, Float cash) {
        this.username = username;
        this.hash = hash;
        this.cash = cash;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getHash() {
        return hash;
    }

    public Float getCash() {
        return cash;
    }
}
