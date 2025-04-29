package com.anudip.learning;

class Student2 {
    private String name, department;
    private int age;

    Student2(){} //default parameter

    //parameterized constructor
    Student2(String name, String department, int age){
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
        Student2 s1=new Student2("Pihu", "cse", 20);
        s1.display();
        Student2 s2=new Student2("Payal", "DevOps", 20);
        s2.display();

        System.out.println("\n With default  constructor");
        Student2 s3= new Student2();
        s3.setName("Pihu Sharma");
        s3.setAge(20);
        s3.setDepartment("DevOps");
        s3.display();

        System.out.println("\n With getter and setter");
        Student2 s4= new Student2();
        s4.setName("Payal Sharma");
        s4.setAge(20);
        s4.setDepartment("DevOps");
        System.out.println("student4 name: " + s4.getName());
        System.out.println("student4 age: " + s4.getAge());
        System.out.println("student 4 department: " + s4.getDepartment());
    }
}
