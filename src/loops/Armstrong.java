package loops;
import java.util.Scanner;
//import java.lang.Math;
public class Armstrong {
    Scanner s = new Scanner(System.in);

    void isArmstrong(){
        System.out.println("Enter start and end of range respectively: ");
        int start= s.nextInt();
        int end=s.nextInt();
        for(int num=start; num<=end;num++) {
            int actualNum=num;
            int result=0;
            while (actualNum != 0) {
                int digit = actualNum % 10;
//                digit = digit * digit * digit;
                result = result + digit;
                actualNum = actualNum / 10;
            }
            if (result == num)
                System.out.println(num + " is armstrong");
        }
    }

}
