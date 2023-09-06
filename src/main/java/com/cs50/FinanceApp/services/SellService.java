package com.cs50.FinanceApp.services;

import com.cs50.FinanceApp.controllers.SellRequest;
import com.cs50.FinanceApp.model.Purchases;
import com.cs50.FinanceApp.model.TransactionType;
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
    public Purchases sellStock(SellRequest sellRequest) {

        long userId = 1; // userId na sztywno - zastąpić po autoryzacji;

        float price = 1F; // price na sztywno - zastąpić np. YahooApi.price(symbol);

//        Purchases purchases = new Purchases(userId, sellRequest.getSymbol(), sellRequest.getShares(), price, TransactionType.SELL);
//
//        Purchases savedPurchase = purchasesRepository.save(purchases);
//        return savedPurchase;

        // Pobieranie użytkownika z bazy danych
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("Użytkownik nie istnieje"));

        // Pobieranie wszystkich transakcji zakupu użytkownika
        Iterable<Purchases> userPurchases = purchasesRepository.findByUserIdAndSymbol(userId,sellRequest.getSymbol());

        // Obliczanie dostępnych akcji użytkownika
        int availableShares = calculateAvailableShares(userPurchases, sellRequest.getSymbol());

        // Sprawdzanie, czy użytkownik ma wystarczającą ilość akcji do sprzedaży
        if (availableShares < sellRequest.getShares()) {
            throw new IllegalArgumentException("Nie masz wystarczająco dużo akcji do sprzedaży");
        }

        // Obliczanie wartości transakcji
        float totalValue = price * sellRequest.getShares();

        // Aktualizacja stanu konta użytkownika i zapisanie nowej transakcji
        user.setCash(user.getCash() + totalValue);
        Purchases newPurchase = new Purchases(
                userId,
                sellRequest.getSymbol(),
                -sellRequest.getShares(),
                price,
                TransactionType.SELL
        );
        purchasesRepository.save(newPurchase);
        userRepository.save(user);

        return newPurchase;
    }

    private int calculateAvailableShares(Iterable<Purchases> purchases, String symbol) {
        int availableShares = 0;
        for (Purchases purchase : purchases) {
            if (purchase.getSymbol().equals(symbol)) {
                availableShares += purchase.getShares();
            }
        }
        return availableShares;
    }

// TODO: skrypt / test do automatycznego uzupełniania danych w db

}




