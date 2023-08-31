package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BuyController {
    @RequestMapping(value = "/buy", method = {RequestMethod.GET, RequestMethod.POST})
    // @LoginRequired
    public String buy() {
        // Obsługa żądania GET lub POST pod adresem "/buy"
        return "buy";
    }
}
