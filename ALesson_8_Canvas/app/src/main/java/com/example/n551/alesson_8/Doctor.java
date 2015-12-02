package com.example.n551.alesson_8;

import io.realm.RealmObject;

/**
 * Created by N551 on 30.11.2015.
 */
public class Doctor extends RealmObject{

    private String name;
    private String lastName;
    private int age;

    public Doctor()
    {

    }

    public Doctor(String name, String lastName, int age)
    {
        this.setName(name);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
