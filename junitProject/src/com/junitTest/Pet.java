package com.junitTest;

public class Pet {
    private String name;
    private int age;


    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
