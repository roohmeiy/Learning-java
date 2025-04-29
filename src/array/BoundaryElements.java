package array;

public class BoundaryElements {
    public static void main(String[] args) {
        BoundaryElements be= new BoundaryElements();
        be.printBoundaryElements();
    }

    void printBoundaryElements(){
        int[][] arr={{1,2,3,4,5}, {6,7,8,9,0}, {1,2,3,4,5}, {6,7,8,9,0},{6,7,8,9,0}};

        System.out.println("Printing matrix.............");
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        };
        System.out.println();
        System.out.println("Printing boundary elements............");
        for(int i=0;i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                if(i==0 || i==arr.length-1 || j==0 || j==arr[i].length-1){
                    System.out.print(arr[i][j] + " ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
