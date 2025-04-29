package com.anudip.learning;

//creating vehicle class
public class Vehicle {
    //creating start method of vehicle class
    void start(){
        System.out.println("Vehicle Started");
    }
}
// inheriting class Car from vehicle
class Car extends Vehicle{
    //overriding start method of vehicle class
    void start(){
        System.out.println("Car Started");
    }
}

// inheriting class Motorcycle from vehicle
class Motorcycle extends Vehicle{
    //overriding start method of vehicle class
    void start(){
        System.out.println("Motorcycle Started");
    }
}

//creating class Garage
class Garage{

    //creating method serviceVehicle that will take object as an argument
    void serviceVehicle(Vehicle vehicle){

        //calling start method of particular object
        vehicle.start();
        //printing statement
        System.out.println("Vehicle serviced");
    }
}

//creating Main class
class Main{
    //creating main method
    public static void main(String[] args) {

        //creating objects of Car, Motorcycle and Garage car respectively
        Car car=new Car();
        Motorcycle motorcycle=new Motorcycle();
        Garage ob=new Garage();

        //calling serviceVehicle method of garage class by passing Car class' object as argument
        ob.serviceVehicle(car);
        System.out.println();   //blank line for readability in output

        //calling serviceVehicle method of garage class by passing motorcycle class' object as argument
        ob.serviceVehicle(motorcycle);
    }
}