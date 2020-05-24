package com.xrm.controller;

import com.xrm.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(value= "http://localhost:8080/auth/login-2/Justin1/Password")
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @GetMapping(path = "/login-2/{userId}/{password}")
    public ResponseEntity auth2(@PathVariable("userId") String userId, @PathVariable("password") String password) {
        return ResponseEntity.ok(loginService.auth2(userId,password));
    }

}
