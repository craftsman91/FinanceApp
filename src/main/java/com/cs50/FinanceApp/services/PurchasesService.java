package com.cs50.FinanceApp.services;

import com.cs50.FinanceApp.model.Purchases;
import com.cs50.FinanceApp.repositories.PurchasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PurchasesService {

    private final PurchasesRepository purchasesRepository;

    @Autowired
    public PurchasesService(PurchasesRepository purchasesRepository) {

        this.purchasesRepository = purchasesRepository;
    }

    @Transactional
    public List<Purchases> findPurchasesByUserId(Long userId) {

        return purchasesRepository.findByUserId(userId);
    }

    @Transactional
    public void savePurchase(Purchases purchase) {
        purchasesRepository.save(purchase);
    }

    @Transactional
    public void sellStock(Long userId, String symbol, int sharesToSell, double currentPrice) {
        purchasesRepository.sellStock(userId, symbol, sharesToSell, currentPrice);
    }
}
