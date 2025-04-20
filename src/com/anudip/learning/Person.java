package com.anudip.learning;

import java.sql.SQLOutput;

public class Person {
    int age=20,salary=50000;
    String name= "Pihu";
    public static void main(String[] args) {
        Person person= new Person();
        System.out.println("name: " + person.name);
        System.out.println("age:" + person.age);
        System.out.println("salary:" + person.salary);
        System.out.println("Test Successful");
    }
}
