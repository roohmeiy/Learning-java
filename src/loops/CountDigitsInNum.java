package loops;
import java.util.Scanner;
public class CountDigitsInNum {
    void calculateDigit(){
        System.out.println("Enter num: ");
        Scanner s=new Scanner(System.in);
        int num= s.nextInt();
        int count=0;

        while(num>0){
          num= num / 10;
          count++;
        }
        System.out.println("Digits in your num: " + count);
    }
}
