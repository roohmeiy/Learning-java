package com.anudip.learning;
import java.util.Scanner;
//import java.lang.Math;
public class ArmstrongInRange {
    public static void main(String[] args) {
        ArmstrongInRange armstrongInRange =new ArmstrongInRange(); //creating object
        armstrongInRange.isArmstrong();    //call method to retrieve the armstrong nos. in range
    }
    Scanner s = new Scanner(System.in);
    void isArmstrong(){
        int digit;
        System.out.println("Enter start and end of range respectively: ");
        int start= s.nextInt();     //taking start from user input
        int end=s.nextInt();        //taking end from user input
        for(int num=start; num<=end;num++) {
            int actualNum=num; //copying num value in actualNum so that we can compare nums before and after calculation
            int result=0;   //initialize result to 0

            //logic part
            while (actualNum != 0) {
                 digit = actualNum % 10; //retrieve last digit
//                digit = digit * digit * digit; //cube of last digit
                digit=cube(digit); //cube of digit
                result = result + digit; //add cube of last digit to prev result
                actualNum = actualNum / 10; //remove last digit
            }
            //print num if it is armstrong
            if (result == num)
                System.out.println(num + " is armstrong");
        }
        }
        //using loop to calculate cube of digit (unnecessary but question's requirement)
    int cube(int digit){
        int cube=1;
        for(int i=0;i<3;i++)
            cube=cube*digit;
        return cube;
    }
}
