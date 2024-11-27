package com.zula.Model;

import java.util.ArrayList;

public class User {

    public int id;
    public String name;
    public int password;
    public int age;
    public String gender;

    public ArrayList<String> history = new ArrayList<>();

    public User(int id, String name,int password,int age,String gender){
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    
    
}
