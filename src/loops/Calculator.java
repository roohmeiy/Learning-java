package loops;
import java.util.Scanner;
public class Calculator {
    char response;
    int num1, num2;
    String operator;
    Scanner s=new Scanner(System.in);
    void calculate(){
        do{
            System.out.println("Enter 2 numbers");
            double num1= s.nextDouble();
            double num2=s.nextDouble();
            System.out.println("What is the operation you want to perform? \n Enter one from: +,-,*,/,%");
            String operator= s.next();
            if (operator.equals("+"))
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
             else if (operator.equals("-"))
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
             else if (operator.equals("*"))
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
             else if (operator.equals("/")) {
                if (num2 != 0)
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero.");
            } else if (operator.equals("%"))
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
             else
                System.out.println("Enter a valid operation.");
            System.out.println("Do you want to do another operation? Enter 'y' for yes.");
            response = s.next().charAt(0);
        } while(response=='y' || response=='Y');
    }
}
