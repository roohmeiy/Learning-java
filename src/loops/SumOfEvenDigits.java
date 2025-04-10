package loops;

public class SumOfEvenDigits {
    int num=616161616;
    int sum=0;
    int digit;
    void sum(){
        while(num !=0) {
            digit = num % 10;
            if (digit % 2 == 0)
                sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum: " + sum);
    }

}
