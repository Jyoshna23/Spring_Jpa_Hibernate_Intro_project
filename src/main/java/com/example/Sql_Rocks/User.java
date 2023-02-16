package com.example.Sql_Rocks;

import jakarta.persistence.*;

@Entity
@Table(name = "user_info")
public class User {

    @Id
    private int id;

    private String name;

    private int age;

    private String phoneNo;

    @Column(unique = true)
    private String email;



    public User() {
    }

    public User(int id, String name, int age, String phoneNo, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.email = email;

    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
