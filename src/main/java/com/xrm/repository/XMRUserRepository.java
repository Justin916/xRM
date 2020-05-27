package com.xrm.repository;

import com.xrm.entity.XRMUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XMRUserRepository extends JpaRepository<XRMUser,Long> {

    XRMUser findByUserId(String userId);
}
