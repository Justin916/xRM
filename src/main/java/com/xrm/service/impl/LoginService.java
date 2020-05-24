package com.xrm.service.impl;

import com.xrm.entity.User;
import com.xrm.repository.UserRepository;
import com.xrm.service.ILoginService;
import com.xrm.util.EntityFactoryForDemoData;
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
//        User user = userRepository.findAll().get(0);
//        System.out.println("User :" + user.toString());
        return new EntityFactoryForDemoData().createAUser();
    }
}
