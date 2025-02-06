package com.project.learning.controller;

import com.project.learning.dtos.UserDTO;
import com.project.learning.entities.User;
import com.project.learning.services.dbServices.UserDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserDbService userDbService;
    @GetMapping("/detail")
    public User getUserDetail(@RequestParam String mobile){
        return userDbService.fetchAllByMobile(mobile);
    }
    @PostMapping("/create")
    public String createUser(@RequestBody UserDTO user){
        userDbService.createUser(user);
        return "Success";
    }
}
