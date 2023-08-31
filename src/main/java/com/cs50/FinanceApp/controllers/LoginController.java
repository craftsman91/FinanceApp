package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login() {
        // Obsługa żądania GET lub POST pod adresem "/login"
        return "login"; // Przykład nazwy widoku Thymeleaf lub FreeMarker
    }
}