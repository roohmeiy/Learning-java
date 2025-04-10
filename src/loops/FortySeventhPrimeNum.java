package loops;

public class FortySeventhPrimeNum {
    int count = 1;
    int num = 2;
    boolean isBoolean;

    void fortySeventhPrimeNum() {
        while (count <= 47) {
            if (num >= 2 && !notPrime(num))
                count++;
            num++;
        }
        System.out.println("47th prime num: " + num);
    }
    boolean notPrime(int num){
        for (int i=2;i<num;i++)
            if (num % i == 0)
                return true;
        return false;
    }
}