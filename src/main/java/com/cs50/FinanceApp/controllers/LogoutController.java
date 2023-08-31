package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout() {
        // Obsługa żądania GET pod adresem "/logout"
        return "logout"; // Przykład nazwy widoku Thymeleaf lub FreeMarker
        // po wylogowaniu ładujemy domyślny adres Home "/"
    }
}
