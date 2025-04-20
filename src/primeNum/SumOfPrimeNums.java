package primeNum;
import java.util.Scanner;

public class SumOfPrimeNums {
    Scanner s= new Scanner(System.in);

    void sumOfPrimeNums(){
        int sum=0;
            System.out.println("Enter the number till u want sum: ");
            int count=s.nextInt();
            if(count<2)
                System.out.println("Prime num starts from 2. You entered less than 2");
            else {
                System.out.println("sum of prime nums till " + count);
                for (int num = 2; num <= count; num++) {
                    if (isPrime(num)) {
                        sum=sum+num;
                    }
                }
            }
        System.out.println(sum);
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
