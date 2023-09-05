package com.cs50.FinanceApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history") // Endpoint
public class HistoryController {

    @GetMapping
    // @LoginRequired - Jeśli masz autentykację
    public TransactionHistory getHistory() {
        // Tutaj możesz pobrać dane z bazy danych lub innych źródeł
        TransactionHistory history = new TransactionHistory();
        history.setQuantity(10); // Ustaw dane z historii transakcji
        history.setDate("2023-08-28");
        history.setCost(500.0);

        return history;
    }
}
