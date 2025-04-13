package com.anudip.learning;

public class Student {
    private String name, department;
    private int age;

    Student(){} //default parameter

    //parameterized constructor
    Student(String name, String department, int age){
        this.name=name;
        this.department=department;
        this.age=age;
    }

    //getters and setters for properties
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }


        void display(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(department);
        }

    public static void main(String[] args) {
        System.out.println("With parameterized constructor");
        Student s1=new Student("Pihu", "cse", 20);
        s1.display();
        Student s2=new Student("Payal", "DevOps", 20);
        s2.display();

        System.out.println("\n With default  constructor");
        Student s3= new Student();
        s3.setName("Pihu Sharma");
        s3.setAge(20);
        s3.setDepartment("DevOps");
        s3.display();

        System.out.println("\n With getter and setter");
        Student s4= new Student();
        s4.setName("Payal Sharma");
        s4.setAge(20);
        s4.setDepartment("DevOps");
        System.out.println("student4 name: " + s4.getName());
        System.out.println("student4 age: " + s4.getAge());
        System.out.println("student 4 department: " + s4.getDepartment());
    }
}
