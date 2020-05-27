package com.xrm.controller;

import com.xrm.entity.XRMUser;
import com.xrm.service.IXMRUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class XRMUserController {

    @Autowired
    private IXMRUserService userService;

    @GetMapping("/xmruser/all")
    List<XRMUser> all() {
        return userService.findAll();
    }

    @GetMapping("/xmruser/{id}")
    XRMUser userById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/xmruser/save")
    XRMUser save(@RequestBody XRMUser user) {
        return userService.save(user);
    }
}