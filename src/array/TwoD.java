package array;

public class TwoD {
    public static void main(String[] args) {
        int [][]a= new int[2][2];
        a[0][0]=10;
        a[0][1]=10;
        a[1][0]=10;
        a[1][1]=10;
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        };


    }
}
