package com.cs50.FinanceApp.services;

import com.cs50.FinanceApp.model.User;
import com.cs50.FinanceApp.repositories.PurchasesRepository;
import com.cs50.FinanceApp.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BuyService {

    private final UserRepository userRepository;
    private final PurchasesRepository purchasesRepository;

    public BuyService(UserRepository userRepository, PurchasesRepository purchasesRepository) {
        this.userRepository = userRepository;
        this.purchasesRepository = purchasesRepository;
    }

    @Transactional
    public void buyStock(User user, String symbol, Integer shares, Float price) {
        // Dodaj logikę biznesową dla zakupu akcji
        // Upewnij się, że użytkownik ma wystarczającą ilość gotówki
        // Zaktualizuj saldo użytkownika
        // Dodaj rekord do purchasesRepository
    }
}
