package com.anudip.learning;    //importing package

import java.util.Arrays;    //importing package

//creating class
public class ThreeDArray {
    //main method
    public static void main(String[] args) {

        ThreeDArray ob= new ThreeDArray();  //creating obj of class
        ob.operations();    //calling operations method
    }

    void operations(){
        int largest=0;  //initializing largest to zero
        double sum=0; //initializing sum to 0

        //creating and initializing 3d array
        int[][][] arr = {
                //block1, 2 rows, 2 cols
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                //block2,2 rows, 2 cols
                {
                        {7, 22, 9},
                        {4, 5, 6}
                }
        };

        //loop to find out the maximum value element in the 3d array
        for(int i=0;i< arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                for(int k=0;k<arr[i][j].length;k++){
                    if(arr[i][j][k]>largest)
                        largest = arr[i][j][k];     //if element is larger than largest then copy the element to largest
                    sum = sum + arr[i][j][k];       //adding elements
                }

        System.out.println(" Largest element: " + largest);         //displaying maximum value element
        double average= sum/(arr.length*arr[0].length*arr[0][0].length);    //calculating average
        System.out.println("\n Average: " +average );   //displaying average

        //Displaying elements
        System.out.println("\n Displaying elements  ==============================================>");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
