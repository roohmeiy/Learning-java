package primeNum;
import java.util.Scanner;
public class PrimeFactorization {
    Scanner s= new Scanner(System.in);

    void primeFatorization(){
        System.out.println("Enter num whose prime factors u want: ");
        int num= s.nextInt();
        System.out.println("Prime factors: ");
        for(int i=2;i<num;i++){
            if ((num % i == 0 && isPrime(i)) ){
                System.out.println(i);
            }
        }
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
