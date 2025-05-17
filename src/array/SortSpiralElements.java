package array;

import java.util.Arrays;

public class SortSpiralElements {

    static int rowEnd,colEnd, rowStart, colStart, sortCount;
    public static void main(String[] args) {
        int[][] arr = {{21,22,23,24,25},{1, 2, 3, 4, 5},{16,17,18,19,20},{11,12,13,14,15} ,{6,7,8,9,10}};
        int row= arr.length;
        int col=arr[0].length;
        rowStart=0;
        colStart=0;
        /* sorting into 1d */
        int[] oneD= new int[row*col];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                oneD[count]=arr[i][j];
                count++;
            }
        }
        Arrays.sort(oneD);
        for(int x: oneD)
            System.out.print(x + " ");

        /* placing */

        sortCount=0;
        rowEnd = row - 1;
        colEnd = col - 1;
        while (rowStart <= rowEnd && colStart <= colEnd ){

            // Left to right
            for (int i = colStart; i <= colEnd; i++) {
                arr[rowStart][i] = oneD[sortCount++];
            }
            rowStart++;

            // Top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                arr[i][colEnd] = oneD[sortCount++];
            }
            colEnd--;

            // Right to left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    arr[rowEnd][i] = oneD[sortCount++];
                }
                rowEnd--;
            }

            // Bottom to top
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    arr[i][colStart] = oneD[sortCount++];
                }
                colStart++;
            }

        }

        /* printing spiral array */
        System.out.println("\n Printing 2D Array:");
        for (int[] rows : arr) {
            for (int num : rows) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}