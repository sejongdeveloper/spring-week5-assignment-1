package com.codesoom.assignment.controllers;


import com.codesoom.assignment.application.UserService;
import com.codesoom.assignment.dto.UserData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserData createUser(@RequestBody @Valid UserData userData){
        return userService.createUser(userData);
    }

    @PatchMapping("{id}")
    public UserData updateUser(@PathVariable Long id,@RequestBody UserData userData){
        return userService.updateUser(id, userData);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public UserData deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

}
