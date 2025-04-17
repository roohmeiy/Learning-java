package array;
import java.util.Scanner;

public class SmallestOfElement {
//    int []arr={90,20,30,10,80,20};

    void smallest(){
        //taking array elements input from user
        System.out.println("How many elements u want to store");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter elements");
        for(int i=0; i<arr.length;i++)
            arr[i]=sc.nextInt();

        int smallest=arr[0];
        System.out.println("Smallest element: ");
        for(int i=0;i<arr.length;i++){
            if (arr[i]<smallest)
                smallest=arr[i];
        }
        System.out.println("smallest num =" + smallest);
    }
}
