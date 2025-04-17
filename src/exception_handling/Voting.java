package exception_handling;
import java.util.Scanner;
public class Voting {
    void voting() throws UnderAgeException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age= sc.nextInt();
            if (age<18)
                throw new UnderAgeException("u are underage");
            else
                System.out.println("age: " + age);
    }
}
//we can use try catch block with throw and throws