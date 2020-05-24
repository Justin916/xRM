package com.xrm.service.impl;

import com.xrm.entity.User;
import com.xrm.repository.UserRepository;
import com.xrm.service.ILoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginService implements ILoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User auth2(String userId,String password) {
        return userRepository.findByUserId(userId);
    }
}
