package com.anudip.learning; //package

import java.util.Scanner; // importing scanner class

//class for addition of matrices
public class AdditionOfMatrix {
    Scanner s=new Scanner(System.in);   //creating obj of scanner class

    //main method
    public static void main(String[] args) {
        //creating obj of class
    AdditionOfMatrix add= new AdditionOfMatrix();
//    calling add method of class
    add.addition();
    }

    //creating addition method
    void addition(){

        //taking no. of rows as input from user
        System.out.println("Enter the total no. of  rows u want for matrices: ");
        int Rows= s.nextInt();

        //taking no. of columns as input from user
        System.out.println("Enter the total no. of  columns u want for matrices: ");
        int Columns= s.nextInt();

        //creating array for matrix1 with the rows and column we took from user as input
        Integer[][] firstMatrix=new Integer [Rows][Columns];

        //Taking elements of first matrix as input from user
        System.out.println();
        System.out.println("Enter elements of first matrix==============================>");

        for(int i=0;i<firstMatrix.length;i++)
            for (int j=0;j<firstMatrix[i].length;j++){
                System.out.println("Enter element at row " + i + " column " + j + ":");
                firstMatrix[i][j]= s.nextInt();
            }

        //Second Matrix

        //creating array for matrix2 with the rows and column we took from user as input
        Integer[][] secondMatrix=new Integer [Rows][Columns];

        //Taking elements of first matrix as input from user
        System.out.println();
        System.out.println("Enter elements of 2nd matrix==============================>");

        for(int i=0;i<secondMatrix.length;i++)
            for (int j=0;j<secondMatrix[i].length;j++){
                System.out.println("Enter element at row " + i + " column " + j + ":");
                secondMatrix[i][j]= s.nextInt();
            }

        //checking if the element ids of integer type
//        if(firstMatrix[0][1] instanceof Integer)
//            System.out.println("Integer");

        //Displaying elements of first matrix
        System.out.println();
        System.out.println("First Matrix ======================================================>");
        for(int i=0;i<firstMatrix.length;i++) {
            for (int j = 0; j < firstMatrix[i].length; j++)
                System.out.print(firstMatrix[i][j] + " ");
            System.out.println();
        };

        //Displaying elements of 2nd Matrix
        System.out.println();
        System.out.println("2nd Matrix ======================================================>");
        for(int i=0;i<secondMatrix.length;i++) {
            for (int j = 0; j < secondMatrix[i].length; j++)
                System.out.print(secondMatrix[i][j] + " ");
            System.out.println();
        }

        //creating empty sum matrix
        Integer[][] sumMatrix= new Integer[Rows][Columns];

        //sum of 2 matrices
        //logic
        for(int i1 = 0, j1 = 0, k1=0 ; i1 < firstMatrix.length && j1 <secondMatrix.length && k1< sumMatrix.length; i1++, j1++,k1++)
            for(int i2 = 0, j2 = 0, k2 = 0; i2 < firstMatrix[i1].length && j2 < secondMatrix[j1].length && k2 < sumMatrix[0].length; i2++, j2++, k2++){
                sumMatrix[k1][k2]= firstMatrix[i1][i2]+ secondMatrix[j1][j2];
            }

        //displaying sum matrix
        System.out.println();
        System.out.println("Sum Matrix ======================================================>");
        for(int i=0;i<sumMatrix.length;i++) {
            for (int j = 0; j < sumMatrix[i].length; j++)
                System.out.print(sumMatrix[i][j] + " ");
            System.out.println();
        }
    }
}

