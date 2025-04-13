package com.anudip.learning;
import java.util.Scanner;

public class Calculator {
    int add(int num1,int num2){
        return num1+num2 ;
    }
    int add(int num1,int num2, int num3){
        return num1+num2+num3;
    }
    double add(double num1, double num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Calculator calculate= new Calculator();

        //passing value as parameter
        System.out.println("Addition of 2 int : " + calculate.add(10,10));
//        System.out.println("Addition of 3 int : " + calculate.add(10,10,10));
        System.out.println("Addition of 2 double : " + calculate.add(10.5,10.5));

        //taking input from user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of num1, num2, num3 respectively: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Addition of 3 int: " + calculate.add(num1,num2,num3));
    }
}
