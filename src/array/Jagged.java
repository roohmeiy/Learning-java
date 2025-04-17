package array;

public class Jagged {
    public static void main(String[] args) {
    int [] [] jagged=new int[5][];
    jagged[0]= new int [] {1,2,3};
    jagged[1]= new int[]{1,5};
        jagged[2]= new int[]{1,2,5};
        jagged[3]= new int[]{1,5,5,6};
        jagged[4]= new int[]{1,2};

        for (int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }

}
