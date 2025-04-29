package com.anudip.learning;

//creating class Student
public class Student {

    //declaring variables
    String name, department;
    int age;

    //Zero-arg constructor (Default) --------> initializing default values of variables
    Student(){
        name="Unknown";
        age=20;
        department="Unassignment";
    }

    //Parameterized constructor that will take 2 parameters - name, int
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    //Parameterized constructor that will take 3 parameters - name, int, department
    Student(String name, int age, String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }

    //display method to display all the details of student
    void display(){
        System.out.println("Details................");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

//Main Class
class StudentMain{

    //main method
    public static void main(String[] args) {
        Student student1=new Student(); //calling ob(student1) with no-arg constructor that will initialize the variables with default values
        student1.display();               //printing details of student1

        Student student2=new Student("Payal", 20); //calling parameterized constructor with 2 arguments that will initialize those two variables with the values of given arguments
        student2.display();                 //printing details of student2

        Student student3=new Student("Payal",20,"Programming");  //calling parameterized constructor with all 3 arguments that will initialize those(all) variables with the values of given arguments
        student3.display();                  //printing details of student3
    }
}
