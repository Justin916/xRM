package com.xrm.service.impl;

import com.xrm.entity.XRMUser;
import com.xrm.repository.XMRUserRepository;
import com.xrm.service.IXMRUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class XMRUserService implements IXMRUserService {

    @Autowired
    private XMRUserRepository userRepository;

    @Override
    public XRMUser save(XRMUser user) {
        return userRepository.save(user);
    }

    @Override
    public List<XRMUser> findAll() {
        return userRepository.findAll();
    }

    @Override
    public XRMUser findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }
}
