package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {

    @GetMapping("/")
    public String index() {
        // Obsługa żądania GET pod adresem "/"
        // Jeżeli użytkownik jest zalogowany, to powinno wyświetlać się portfolio z nazwą użytkownika, ilością posiadanych akcji, posiadaną gotówką, wartością portfela, itp.
        // Jeżeli użytkownik nie jest zalogowany, to powinno nas przekierować na "/login"
        return "index"; // Przykład nazwy widoku Thymeleaf lub FreeMarker
    }
}
