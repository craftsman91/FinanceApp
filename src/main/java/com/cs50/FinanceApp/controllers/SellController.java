package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SellController {

    @RequestMapping(value = "/sell", method = {RequestMethod.POST})
    //@LoginRequired
    public String sell() {
        // Obsługa żądania GET lub POST pod adresem "/sell"
        return "sell"; //
    }
}
