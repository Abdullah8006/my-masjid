package com.abd.mymasjid.user.internal;

public class User {

    private String name;
    private Long age;

    public User(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
