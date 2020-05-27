package com.xrm.service.impl;

import com.xrm.entity.XRMUser;
import com.xrm.repository.XMRUserRepository;
import com.xrm.service.ILoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginService implements ILoginService {

    @Autowired
    private XMRUserRepository userRepository;

    @Override
    public XRMUser auth2(String userId, String password) {
        return userRepository.findByUserId(userId);
    }
}
