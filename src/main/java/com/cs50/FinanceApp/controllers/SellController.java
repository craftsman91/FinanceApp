package com.cs50.FinanceApp.controllers;

import com.cs50.FinanceApp.model.Purchases;
import com.cs50.FinanceApp.services.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sell")
public class SellController {

    private final SellService sellService;

    @Autowired
    public SellController(SellService sellService) {
        this.sellService = sellService;
    }

    @PostMapping
    public ResponseEntity<Purchases> sellStock(@RequestBody SellRequest sellRequest) {
        try {
            // Wywołaj serwis SellService do obsługi sprzedaży
            Purchases purchases = sellService.sellStock(sellRequest);
            return ResponseEntity.ok(purchases);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

}
