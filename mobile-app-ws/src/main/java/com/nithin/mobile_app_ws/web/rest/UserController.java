package com.nithin.mobile_app_ws.web.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    @GetMapping()
    public String getUsers(@RequestParam(value="page", defaultValue = "4") int page,
                           @RequestParam(value="limit",defaultValue = "50") int limit,
                           @RequestParam(value="sort",defaultValue = "desc",required = false) String sort){
        return "get users was called with page = " + page + " and limit = " + limit + " and sort is "+sort;
    }

    @GetMapping("/{userId}")
    public String getUser(@PathVariable String userId){
        return "get user was called by Id="+userId;
    }

    @PostMapping
    public String createUser(){
        return "create user was called";
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}
