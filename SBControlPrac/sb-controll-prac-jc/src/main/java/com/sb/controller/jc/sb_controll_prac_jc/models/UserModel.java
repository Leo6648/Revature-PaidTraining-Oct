package com.sb.controller.jc.sb_controll_prac_jc.models;

public class UserModel {
    private String name;
    private int age;
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
    public UserModel(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public UserModel() {
    }

}
