package com.example.Sql_Rocks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/add_user")
    public String createUser(@RequestBody User user){

        return userService.createUser(user);
    }
    
    
    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id){

        return userService.getUser(id);
    }

    @GetMapping("/get_all_users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
