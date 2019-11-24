package com.commanderleague.controller;

import com.commanderleague.dto.CreateUserRequest;
import com.commanderleague.models.User;
import org.springframework.web.bind.annotation.RestController;
import com.commanderleague.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LoginController {
    private UserService userService;
    
    /*@PostMapping(path="/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return userService.login(loginRequest);
    }*/

    @PostMapping(path = "/registration")
    public ResponseEntity<Void> createNewUser(@RequestBody CreateUserRequest request) {
        User userExists = userService.findUserNumber_DCI(request.getNumber_DCI());
        if (userExists != null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
        } else {
            userService.saveUser(request);
            return new ResponseEntity<Void>(HttpStatus.CREATED);

        }
    }
    
}
