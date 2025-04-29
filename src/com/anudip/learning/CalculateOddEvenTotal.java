package com.anudip.learning;
import java.util.Scanner;  //importing scanner package

// class
public class CalculateOddEvenTotal {
    Scanner s= new Scanner(System.in);  //creating object of scanner class
    public static void main(String[] args) { //creating main method
        CalculateOddEvenTotal calculate=new CalculateOddEvenTotal(); //creating object of current class
        calculate.calculate();  //calling calculate function
    }

    //creating method to check odd/even numbers and print their count
    void calculate(){
        int odd,even,response; //declaring variables
        odd=even=response=0; //initializing variables to zero
        //starting do loop
        do{
            System.out.println("Enter number: ");
            int num=s.nextInt();    //taking num as input from user

            //evaluating condition and print result
            if(num%2==0){
                System.out.println(num + " is even.");
                even++;
                System.out.println("Total even numbers until now: " + even);
                System.out.println("Total odd numbers until now: " + odd);
            }
            else{
                System.out.println(num + " is odd.");
                odd++;
                System.out.println("Total even numbers until now: " + even);
                System.out.println("Total odd numbers until now: " + odd);
            }

            System.out.println();   //blank line for readability in output

            //asking user if he/she wants to evaluate another number
            System.out.println("Do u want to check another number? If yes then Enter any digit and if you don't want to continue then enter '-1' : ");
            response=s.nextInt();   //taking response from user
        }while(response!=-1);   //loop will terminate if user enters --> -1

        //printing count of total even and odd numbers that user has given
        System.out.println("Total even numbers: " + even);
        System.out.println("Total odd numbers: " + odd);
    }

}
