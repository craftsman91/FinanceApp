package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BuyController {
    // bez metody get, ponieważ nie odwołuję się do html'a, działamy tylko po api
    @RequestMapping(value = "/buy", method = {RequestMethod.POST})
    // @LoginRequired
    public String buy() {
        // Obsługa żądania GET lub POST pod adresem "/buy"
        return "buy";
        //
    }
}
