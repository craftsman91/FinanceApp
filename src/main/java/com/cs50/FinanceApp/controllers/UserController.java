package com.cs50.FinanceApp.controllers;


import com.cs50.FinanceApp.model.User;
import com.cs50.FinanceApp.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // /user/1 => chcemy pobrać użytkownika o identyfikatorze 1;

    // /user?userId=1 =>
    @GetMapping(value = "/user/{userId}")
    public User getUser(@PathVariable Long userId){
        // odpytujemy serwis o dane użytkownika
        return userService.test(userId);
    }

}
