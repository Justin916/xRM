package com.xrm.service;

import com.xrm.entity.XRMUser;

public interface ILoginService {

    XRMUser auth2(String userId, String password);

}
