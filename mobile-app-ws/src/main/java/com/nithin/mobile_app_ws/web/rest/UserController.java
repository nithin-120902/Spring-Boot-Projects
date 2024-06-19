package com.nithin.mobile_app_ws.web.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    @GetMapping("/{userId}")
    public String getuser(@PathVariable String userId){
        return "get user was called by Id="+userId;
    }

    @PostMapping
    public String createuser(){
        return "create user was called";
    }

    @PutMapping
    public String updateuser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteuser(){
        return "delete user was called";
    }
}
