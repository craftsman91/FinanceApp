package com.cs50.FinanceApp.repositories;

import com.cs50.FinanceApp.model.Purchases;
import org.springframework.data.repository.CrudRepository;

public interface PurchasesRepository extends CrudRepository<Purchases, Long> {
}
