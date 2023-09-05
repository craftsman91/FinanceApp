package com.cs50.FinanceApp.repositories;

import com.cs50.FinanceApp.model.Purchases;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PurchasesRepository extends CrudRepository<Purchases, Long> {


    // odpowiednik pythonowego db.execute -> pobiera informacje z bazy danych
    // brak operacji -> implementacja sql
    // PurchasesRepository.findByUserId(Id)???
}
