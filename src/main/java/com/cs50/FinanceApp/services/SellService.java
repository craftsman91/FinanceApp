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

        // pobrać z repo wszystkie transakcje dokonane przez użytkownika
        // for each po purchases, suma wszystkich purchases, availableShares > shares, jeżeli nie throw exception (zbyt mała ilość akcji,czy coś w tym stylu);
        // walidacja SellRequest a SellRepository -> czy zgadza się np. symbol, a później czy mamy wystarczającą ilość shares, itp.
        // jeśli wszystko jest ok, to tworzymy new Purchases...


        Purchases purchases = new Purchases(1, sellRequest.getSymbol(), sellRequest.getShares(), price, TransactionType.SELL);

        // Zaktualizać saldo użytkownika
        // Dodać rekord do purchasesRepository z odpowiednim typem transakcji (TransactionType.SELL)

        Purchases savedPurchase = purchasesRepository.save(purchases);
        return savedPurchase;

        // TODO: skrypt / test do automatycznego uzupełniania danych w db
    }



}
