package com.xrm.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@ToString
@Builder
@Entity
@NamedQuery(name = "User.findByUserId", query = "select u from User u where u.userId = ?1")
@Table(name = "User", schema = "xrm")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;    
    @Column(unique = true,name = "userid")
    @NonNull
    private String userId;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String password;
}
