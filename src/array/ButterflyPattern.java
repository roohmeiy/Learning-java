package array;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n=8;

        //upper
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int k=1;k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--) {
                System.out.print("*");
            }
            for(int k=2;k<2*i;k++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
