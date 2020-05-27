package com.xrm.util;

import com.xrm.entity.XRMUser;

public class EntityFactoryForDemoData {

    public XRMUser createAUser() {
        return XRMUser.builder()
                .id(Long.valueOf(1))
                .userId("1")
                .firstName("Justin")
                .lastName("Arockia")
                .password("password")
                .build();
    }

}
