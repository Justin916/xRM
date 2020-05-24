package com.xrm.service;

import com.xrm.entity.User;

public interface ILoginService {

    User auth2(String userId,String password);

}
