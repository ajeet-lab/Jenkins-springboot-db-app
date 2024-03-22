package org.springdb.controllers;


import org.springdb.entities.UserEntities;
import org.springdb.helpers.ApiResponse;
import org.springdb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserEntities createUsers(@RequestBody UserEntities user){
        return this.userService.createUser(user);
    }

    @GetMapping("/users")
    public List<UserEntities> fetchAllUsers(){
        return this.userService.getAllUsers();
    }

    @DeleteMapping("/user/{id}")
    public ApiResponse deleteUser(@PathVariable int id){
        return this.userService.deleteUser(id);
    }
}
