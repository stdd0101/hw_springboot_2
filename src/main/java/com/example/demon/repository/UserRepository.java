package com.example.demon.repository;

import com.example.demon.model.Authorities;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    private ConcurrentHashMap<String, String> users;

    public UserRepository() {
        users = new ConcurrentHashMap<>();
        users.put("user1", "123");
        users.put("user2", "1234");
        users.put("user3", "12345");
    }

    public List<Authorities> getUserAuthorities(String login, String password) {

        // Using search()
        Boolean userExists = users.search(4, (k, v) -> {return (k == login && v == password) ? true: null;});

//        Map.Entry<String, String> appUser
//                = users.searchEntries(1, (e) -> {
//            return (e.getKey().equals(login) && e.getValue().equals(password)) ? e : null;
//        });

        if(!userExists) {
            return new ArrayList<>(Collections.emptyList());
        } else {
            return new ArrayList<>(Arrays.asList(Authorities.values()));
        }
    }
}