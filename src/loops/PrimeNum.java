package loops;

public class PrimeNum {
        boolean isBoolean=true;
        boolean notPrime(int num){
            for (int i=2;i<num;i++)
                if (num % i == 0)
                    return true;
            return false;
        }
        void primeNum(int num) {
            if (num < 2 || notPrime(num))
                System.out.println(num + " is not prime");
            else
                System.out.println(num + " is prime");
        }
}
