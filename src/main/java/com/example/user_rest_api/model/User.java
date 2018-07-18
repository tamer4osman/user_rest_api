package com.example.user_rest_api.model;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int m_userid;
    private String m_name;
    private int m_age;
    public User() {}

    public User(int userid, String name, int age) {
        this.m_userid = userid;
        this.m_name = name;
        this.m_age = age;
    }

    public int getUserId(){return this.m_userid;}

    public String getName(){return this.m_name;}

    public int getAge(){return this.m_age;}

    public void setUserid(int userId){this.m_userid=userId;}

    public void setName(String name){this.m_name=name;}

    public void setAge(int age){this.m_userid=age;}

//other constructors
//getters/setters
}