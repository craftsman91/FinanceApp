package com.cs50.FinanceApp.services;

import com.cs50.FinanceApp.controllers.SellRequest;
import com.cs50.FinanceApp.model.Purchases;
import com.cs50.FinanceApp.model.TransactionType;
import com.cs50.FinanceApp.model.User;
import com.cs50.FinanceApp.repositories.PurchasesRepository;
import com.cs50.FinanceApp.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SellServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PurchasesRepository purchasesRepository;

    private SellService sellService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        sellService = new SellService(userRepository, purchasesRepository);
    }

    @Test
    public void testSellStock() {
        long userId = 1;
        String symbol = "AAPL";
//        int sharesToSell = 10;
//        float price = 150.0F;

        // Mock danych użytkownika
        User user = new User("1", "hashedpassword", 1000.0F);
        when(userRepository.findById(userId)).thenReturn(Optional.of(user));

        // Mock danych transakcji zakupu użytkownika
        List<Purchases> userPurchases = new ArrayList<>();
        userPurchases.add(new Purchases(userId, "AAPL", 5, 140.0F, TransactionType.BUY));
        userPurchases.add(new Purchases(userId, "AAPL", 15, 155.0F, TransactionType.BUY));
        when(purchasesRepository.findByUserIdAndSymbol(userId, "AAPL")).thenReturn(userPurchases);

        // Wywołaj metodę sellStock
        SellRequest sellRequest = new SellRequest("AAPL", 5);

        // metoda którą testuję to jest sellStock

        Purchases result = sellService.sellStock(sellRequest);

        // Sprawdź, czy dane użytkownika i transakcji zostały zaktualizowane
        assertEquals(1005.0F, user.getCash());
        assertEquals(5, userPurchases.get(0).getShares());
        assertEquals(15, userPurchases.get(1).getShares());

        assertEquals("AAPL",result.getSymbol());
        assertEquals( -5,result.getShares());


        // Sprawdź, czy nowa transakcja została zapisana
//        assertEquals(userId, result.getUserId());
//        assertEquals(symbol, result.getSymbol());
//        assertEquals(-sharesToSell, result.getShares());
//        assertEquals(price, result.getPrice(), 0.001);
//        assertEquals(TransactionType.SELL, result.getTransactionType());
    }
}
