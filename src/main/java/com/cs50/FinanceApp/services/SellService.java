package com.cs50.FinanceApp.services;

import com.cs50.FinanceApp.controllers.SellRequest;
import com.cs50.FinanceApp.model.User;
import com.cs50.FinanceApp.repositories.PurchasesRepository;
import com.cs50.FinanceApp.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SellService {

    private final UserRepository userRepository;
    private final PurchasesRepository purchasesRepository;

    public SellService(UserRepository userRepository, PurchasesRepository purchasesRepository) {
        this.userRepository = userRepository;
        this.purchasesRepository = purchasesRepository;
    }

    @Transactional
    public void sellStock(User user, String symbol, Integer shares, Float price) {
        // Dodać logikę biznesową dla sprzedaży akcji
        // Upewnić się, że użytkownik posiada wystarczającą ilość akcji do sprzedaży
        // Zaktualizać saldo użytkownika
        // Dodać rekord do purchasesRepository z odpowiednim typem transakcji (TransactionType.SELL)
    }

    public void sellStock(SellRequest sellRequest) {
    }
}
