package com.cs50.FinanceApp.services;

import com.cs50.FinanceApp.model.User;
import com.cs50.FinanceApp.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService {

    //final wymusza podanie wartości, której nie zmieniam
    private final UserRepository userRepository;

    // PurchaseRepo...

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User test(Long userId){
        // 1L - rozróżnienie pomiędzy intergerem a longiem
        // findById(...) - powinna być pobierana informacja z UserController
        Optional<User> user = userRepository.findById(userId);
        if (user.isEmpty()){
            System.out.println("User not found.");
            // Exception...
            // Jakie exception rzucić na tym endpoincie
            return null;
        } else {
            User userEntity = user.get();
            return userEntity;
        }
    }

    //
}
