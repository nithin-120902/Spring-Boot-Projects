package com.nithin.mobile_app_ws.web.rest;

import com.nithin.mobile_app_ws.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(value = "/{userId}",
            produces = {
                MediaType.APPLICATION_XML_VALUE,
                MediaType.APPLICATION_JSON_VALUE
            }
    )
    public ResponseEntity<User> getUser(@PathVariable String userId){

        User returnValue = new User();
        returnValue.setFirstName("Nithin Krishna");
        returnValue.setLastNAme("Venna");
        returnValue.setEmail("vnithin1209@gmail.com");
        returnValue.setUserId(userId);

        return new ResponseEntity<User>(returnValue,HttpStatus.OK);
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
