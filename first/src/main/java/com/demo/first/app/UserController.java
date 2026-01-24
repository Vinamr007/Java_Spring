package com.demo.first.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private Map<Integer, User> userdb =new HashMap<>();

    @PostMapping
public String createUser(@RequestBody User user){
    userdb.put(user.getId(), user);
    return "success";
}
}
