package com.xrm.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@NamedQuery(name = "XRMUser.findByUserId", query = "select u from XRMUser u where u.userId = ?1")
//@Table(name = "xrmuser", schema = "xrm")
public class XRMUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(unique = true, name = "userid")
    @NonNull
    private String userId;
    @Column(name = "firstname", nullable = false)
    private String firstName;
    @NonNull
    @Column(name = "lastname", nullable = false)
    private String lastName;
    @NonNull
    @Column(nullable = false)
    private String password;
    private String otp = "";
}
