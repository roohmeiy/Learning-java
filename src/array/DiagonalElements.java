package array;

public class DiagonalElements {
    public static void main(String[] args) {
        DiagonalElements de=new DiagonalElements();
        de.printDiagonalElements();
    }
    void printDiagonalElements(){
        int[][] arr={{1,2,3,4,5}, {6,7,8,9,10}, {4,5,4,6,4},{4,5,6,7,8},{4,8,9,5,1}};

        System.out.println("Printing matrix.............");
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        };

        System.out.println();
        System.out.println("Printing diagonal elements");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if(i==j || i+j== arr.length-1  )
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
