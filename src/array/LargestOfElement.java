package array;

import java.util.Scanner;

public class LargestOfElement {
        void largest(){
        int largest=0;

        //taking array elements input from user
        System.out.println("How many elements u want to store");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter elements");
        for(int i=0; i<arr.length;i++)
            arr[i]=sc.nextInt();

        //finding largest
        for(int  i=0;i<arr.length;i++){
            if (arr[i]>largest)
                largest=arr[i];
        }
        System.out.println("largest num =" + largest);
    }
}
