package loops;
import java.util.Scanner;
public class SumOfDigitsInNumber {
    int sum=0;
    Scanner s=new Scanner(System.in);
    void sumOfDigits(){
        System.out.println("enter num");
        int num=s.nextInt();
        while(num !=0){
            int digit= num % 10;
            sum= sum+digit;
            num=num/10;
        }
        System.out.println("sum of digits:" + sum );
    }
}
