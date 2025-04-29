package com.anudip.learning;
import java.util.Scanner;

public class CalculateGrossSalary {

    //declaring variables
    int basicSalary;
    double HRA, DA;

    Scanner s= new Scanner(System.in);   //obj of scanner class for performing input operation

    //creating main method
    public static void main(String[] args) {
        CalculateGrossSalary cgs=new CalculateGrossSalary(); //creating object of class
        cgs.grossSalary();  //calling method that will calculate gross salary
    }

    //method to create gross salary
    void grossSalary(){
        int response=-1;  //initialize response
        do {
            System.out.println("Enter Basic salary:");
            basicSalary = s.nextInt();  //taking basic salary as input from user

            //calculating hra and DA based on basic salary
            if (basicSalary > 15000) {
                HRA = basicSalary * 0.20;
                DA = basicSalary * 0.60;
            } else {
                HRA = 3000;
                DA = basicSalary * 0.70;
            }

            //printing HRA, DA and gross salary
            System.out.println("HRA: " + HRA);
            System.out.println("DA: " + DA);
            System.out.println("Gross Salary: " + (basicSalary + HRA + DA));

            //asking user if he/she wants to calculate another gross salary
            System.out.println("Do you want to calculate other person's Gross Salary? If yes then enter '-1' ");
            //taking response from user
            response=s.nextInt();

        }while(response==-1);  //loop will run until user enters '-1'. any response other than '-1' will terminate the loop
    }
}
