package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sell")
public class SellController {

    // Metoda wyświetlająca formularz sprzedaży
    @GetMapping
    public String showSellForm(Model model) {
        // Wypełnij model danymi potrzebnymi do wyświetlenia formularza
        return "sellForm";
    }

    // Metoda obsługująca sprzedaż akcji
    @PostMapping
    public String sellStock(@RequestParam("symbol") String symbol, @RequestParam("shares") int shares) {
        // Tutaj przetwarzaj dane z formularza, waliduj i dokonuj sprzedaży
        // Aktualizuj stan konta użytkownika i historię transakcji
        return "redirect:/"; // Przekierowanie na stronę główną po sprzedaży
    }
}
