package com.xrm.controller;

import com.xrm.service.ILoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4021")
@Slf4j
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @GetMapping(path = "/login-2/{userId}/{password}")
    public ResponseEntity auth2(@PathVariable("userId") String userId, @PathVariable("password") String password) {
        log.info(String.format("LoginController.auth2(useId:'%s%', password:'%s%')",userId,password));
        return ResponseEntity.ok(loginService.auth2(userId,password));
    }

}
