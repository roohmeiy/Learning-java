package com.anudip.learning;

import java.util.Arrays;

public class ThreeDArray {
    public static void main(String[] args) {
        ThreeDArray ob= new ThreeDArray();
        ob.operations();
    }

    void operations(){
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

        int count=0; //initializing count to 0
        double sum=0; //initializing sum to 0
        //shifting elements in single 1d array
        int total= arr.length * arr[0].length* arr[0][0].length; //calculate the size of array
        int[] joined = new int[total];  //create new array with that that size

//        System.out.println(total);

        //copying values of 3d array to 1d array
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                for(int k=0;k<arr[i][j].length;k++){
                    joined[count]=arr[i][j][k];  //copying elements
                    count++;    //increment counter by 1
                    sum=sum+ arr[i][j][k];      //doing sum pf elements 1 by 1
                }

        Arrays.sort(joined);    //sorting array
//        for(int i=0;i< joined.length;i++)
//            System.out.println(joined[i]);

        //Printing largest element
        System.out.println("Largest element: " + joined[joined.length-1]);
        //calculate average of elements
        double average= sum/(arr.length*arr[0].length*arr[0][0].length);
        //printing average of elements
        System.out.println("Average: " +average );

        //Displaying elements
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
