package com.xrm.service;

import com.xrm.entity.XRMUser;

import java.util.List;

public interface IXMRUserService {
    XRMUser save(XRMUser user);
    List<XRMUser> findAll();
    XRMUser findById(Long id);
}
