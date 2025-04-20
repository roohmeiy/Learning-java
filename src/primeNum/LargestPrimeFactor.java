package primeNum;
import java.util.Scanner;

public class LargestPrimeFactor {
    Scanner s= new Scanner(System.in);
    void largestPrimeFactor(){
        int largest=0;
        System.out.println("Enter num whose largest prime factor u want: ");
        int num= s.nextInt();
        for(int i=2;i<num;i++){
            if ((num % i == 0 && isPrime(i)) ){
                if(i>largest)
                    largest=i;
            }
        }
        System.out.println("Largest prime factor: " + largest);
    }
    boolean isPrime(int num){
        //u can use i<num instead of i<Math.sqrt(num).
        for (int i = 2; i<=Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
