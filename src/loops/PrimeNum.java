package loops;
import java.util.Scanner;

public class PrimeNum{
    Scanner s = new Scanner(System.in);
//    boolean isPrime=true;

    void primeNum(){
        System.out.println("Enter num: ");
        int num=s.nextInt();
        if(isPrime(num))
            System.out.println("Prime num");
        else
            System.out.println("not a prime num");
    }

      boolean isPrime(int num){
          for( int i=2; i < num;i++ ){
              if ( num < 2  || num%i==0)
                  return false;
          }
          return true;
      }
}
