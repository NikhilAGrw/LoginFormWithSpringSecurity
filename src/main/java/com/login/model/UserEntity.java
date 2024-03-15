package com.login.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_entity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "mobile_no")
    private Long mobileNo;
    @Column(name = "email_id")
    private String emailId;
    private String password;
    private String role = "ROLE_USER";

}
