package com.codesoom.assignment.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id; // 식별값

    private String name; // 이름

    private String email; // 이메일

    private String password; // 비밀번호

    public static User createUserForSave(String name, String email, String password) {
        User user = new User();
        user.name = name;
        user.email = email;
        user.password = password;
        return user;
    }

    public void change(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
