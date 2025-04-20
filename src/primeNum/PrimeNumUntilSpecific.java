package primeNum;
import java.util.Scanner;

public class PrimeNumUntilSpecific {
    Scanner s= new Scanner(System.in);
    void primeNumUntilSpecific() {
        System.out.println("Enter the number till there u want prime nums: ");
        int count=s.nextInt();
        if(count<2)
            System.out.println("Prime num starts from 2. You entered less than 2");
        else {
            System.out.println("Prime nums till " + count);
            for (int num = 2; num <= count; num++) {
                if (isPrime(num)) {
                    System.out.println(num);
                }
            }
        }
    }
    boolean isPrime(int num){

        //u can use i<num-1 instead of i<Math.sqrt(num).
        for (int i = 2; i<Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

