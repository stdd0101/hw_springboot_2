package repository;

import model.Authorities;

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
        Map.Entry<String, String> appUser
                = users.searchEntries(2, (e) ->
            (e.getKey().equals(login) && e.getValue().equals(password)) ? e : null);
        System.out.println("\nFind entry via searchEntries(): " + appUser);
        if(appUser == null) {
            return new ArrayList<Authorities>(Collections.emptyList());
        } else {
            return new ArrayList<Authorities>(Arrays.asList(Authorities.values()));
        }
    }
}