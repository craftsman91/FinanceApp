package com.cs50.FinanceApp.repositories;

import com.cs50.FinanceApp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    // pobrać cash -> do serwisu poprzez DI
    //
}
