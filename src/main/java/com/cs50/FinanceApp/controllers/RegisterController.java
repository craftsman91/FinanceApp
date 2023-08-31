package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public String register() {
        // Obsługa żądania GET lub POST pod adresem "/register"
        return "register"; // Przykład nazwy widoku Thymeleaf lub FreeMarker
    }
}
