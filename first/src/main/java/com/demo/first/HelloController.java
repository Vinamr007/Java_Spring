package com.demo.first;

import com.demo.first.app.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }



    @GetMapping("/user")
    public User getUser() {
        User user = new User(1, "John Doe", "vinu");
return user;
    }
}
