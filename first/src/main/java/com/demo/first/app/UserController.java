package com.demo.first.app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private Map<Integer, User> userdb = new HashMap<>();

    @PostMapping
    public String createUser(@RequestBody User user) {
        System.out.println(user.getEmail());
        userdb.putIfAbsent(user.getId(), user);
        return "user created successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        if (userdb.containsKey(user.getId()))
            userdb.put(user.getId(), user);
            return "update successful";


    }

    @DeleteMapping("/{id}")
    public String deleteUsser(@PathVariable int id){
        if(!userdb.containsKey(id))
            return "user not found";
        userdb.remove(id);
        return "delete successful";
    }

    @GetMapping
    public List<User> getUsers(){
        return new ArrayList<>(userdb.values());
    }
}
