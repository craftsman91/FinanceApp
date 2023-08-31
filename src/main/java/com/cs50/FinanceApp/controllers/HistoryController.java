package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryController {

    @GetMapping("/history")
    // @LoginRequired
    public String history() {
        // Obsługa żądania GET pod adresem "/history"

        return "history"; // Przykład nazwy widoku Thymeleaf lub FreeMarker
    }
}
