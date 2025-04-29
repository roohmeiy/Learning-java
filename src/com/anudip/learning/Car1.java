package com.anudip.learning;
import java.util.Scanner;
public class Car1 {
    String make, model;
    short year;
    int price;

    //parameterized constructor
    Car1(String make, String model, short year, int price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    Car1(){} //default constructor

    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter make: ");
        this.make= sc.nextLine();
        System.out.println("Enter model: ");
        this.model= sc.nextLine();
        System.out.println("Enter year: ");
        this.year= sc.nextShort();
        System.out.println("Enter price: ");
        this.price= sc.nextInt();
    }
    void display(){
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
        System.out.println("Car price: " + price);

    }
    public static void main(String[] args) {
        //car1
        System.out.println(" Details of car1 with parameterized constructor");
        System.out.println("\n Enter specifications of the car1 respectively:");
        Car1 car1=new Car1("make1","model1", (short) 2004, 955520);
        car1.display();

        //car2
        System.out.println("\n Details of car 3 and car4 by taking input from user");
        Car1 car12 = new Car1();
        System.out.println("\n Enter specifications of the car3 respectively:");
        car12.getData();
        car12.display();

        //car3
        Car1 car13 =new Car1();
        System.out.println("\n Enter specifications of the car4 respectively:");
        car13.getData();
        car13.display();
    }
}
