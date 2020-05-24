package com.xrm.util;

import com.xrm.entity.User;

public class EntityFactoryForDemoData {

    public User createAUser() {
        return User.builder()
                .id(Long.valueOf(1))
                .userId("1")
                .firstName("Justin")
                .lastName("Arockia")
                .password("password")
                .build();
    }

}
