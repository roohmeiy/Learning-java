package array;

import java.util.Arrays;

public class SortSpiralElements {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};

        int rows= arr.length;
        int cols= arr[0].length;
//        System.out.println(rows*cols);

        int[] joined = new int[rows*cols];
        int count=0;

        System.out.println("Spiral elements================================================>");
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                joined[count] = arr[i][j];
                count++;
            }
        }

        System.out.println();
        System.out.println("Joined in 1d array ===================================>");
        for(int i=0;i<joined.length;i++)
            System.out.print(joined[i] + " ");

        System.out.println();
        System.out.println("Sorted===============================================>");
        Arrays.sort(joined);
        for(int i=0;i<joined.length;i++)
            System.out.print(joined[i] + " ");

        System.out.println();
        System.out.println("sorted 2d array=======================================>");
        count=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=joined[count];
                count++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
