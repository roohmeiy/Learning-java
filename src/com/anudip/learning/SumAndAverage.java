// Package declaration
package com.anudip.learning;

// Importing Scanner class for user input
import java.util.Scanner;

public class SumAndAverage {

    // scanner object for taking input from user
    Scanner s = new Scanner(System.in);

    // main method
    public static void main(String[] args) {
        SumAndAverage ob = new SumAndAverage(); // Creating an object of the class
        ob.sum();      // calling sum method
        ob.average();  // calling average method
    }

    void sum() {
        int sum = 0;    //initializing sum to zero
        System.out.println("How many numbers of sum u want? ");
        int total = s.nextInt(); // Taking total number of elements
        int[] arr = new int[total]; // Creating array of total length that user want

        // Taking input from user
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number: ");
            arr[i] = s.nextInt();
        }

        // Calculating sum
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];

        System.out.println();   //Empty line for readability
        System.out.println("Sum: " + sum);  // Displaying the result
    }

    void average() {
        int sum = 0; //Initializing sum to 0
        System.out.println("How many numbers of average u want? ");
        int total = s.nextInt(); // Taking total number of elements
        int[] arr = new int[total]; // Creating array of specified size

        // Taking input from user
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number: ");
            arr[i] = s.nextInt();
        }

        // Calculating sum
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];

        System.out.println(); //Empty line for readability
        System.out.println("Average: " + (sum/total)); // Displaying the average
    }
}
