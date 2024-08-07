
package com.dev.phonebook.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date createdAt = new Date();

    public User(String name, String email, String password) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
