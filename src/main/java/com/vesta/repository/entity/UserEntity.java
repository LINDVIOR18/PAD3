package com.vesta.repository.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
@Setter
public class UserEntity {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private Timestamp createdOn;
    private Timestamp lastLogin;
}
