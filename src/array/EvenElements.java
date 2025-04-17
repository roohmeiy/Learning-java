package array;
import java.util.Scanner;
public class EvenElements {
//    int []arr= {1,2,3,4,5,6,8,5,6};
    void evenElements(){
        System.out.println("How many elements u want to store");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter elements");
        for(int i=0; i<arr.length;i++)
            arr[i]=sc.nextInt();

        //printing even
        System.out.println("Even elements");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                System.out.println(arr[i]);
        }
    }
}
