package com.cs50.FinanceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public IndexResponse index() {
        // Obsługa żądania GET pod adresem "/"
        // Jeżeli użytkownik jest zalogowany, to powinno wyświetlać się portfolio z nazwą użytkownika, ilością posiadanych akcji, posiadaną gotówką, wartością portfela, itp.
        // Jeżeli użytkownik nie jest zalogowany, to powinno nas przekierować na "/login"
        return new IndexResponse("mstf", 2); // Przykład nazwy widoku Thymeleaf lub FreeMarker
        // json powinien zwracać klasę  {symbol: msft, shares: 2,}
    }


}

class IndexResponse {

    private String symbol;
    private Integer shares;

    public IndexResponse(String symbol, Integer shares) {
        this.symbol = symbol;
        this.shares = shares;
    }


}