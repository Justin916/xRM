package com.xrm.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@NamedQuery(name = "User.findByUserId", query = "select u from User u where u.userId = ?1")
@Table(name = "user", schema = "xrm")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;    
    @Column(unique = true,name = "userid")
    @NonNull
    private String userId;
    @NonNull
    @Column(name = "firstname")
    private String firstName;
    @NonNull
    @Column(name = "lastname")
    private String lastName;
    @NonNull
    private String password;
}
