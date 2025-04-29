package array;

public class BoundaryStar {
    public static void main(String[] args) {
        BoundaryStar be= new BoundaryStar();
        be.printBoundaryElements();
    }

    void printBoundaryElements(){
        int[][] arr= new int[4][5];

        System.out.println("Printing matrix.............");
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print("*"+ " ");
            System.out.println();
        };
        System.out.println();
        System.out.println("Printing * at boundary............");
        for(int i=0;i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                if(i==0 || i==arr.length-1 || j==0 || j==arr[i].length-1){
                    System.out.print("*" + " ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
