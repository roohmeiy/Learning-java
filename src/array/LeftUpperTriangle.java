package array;

public class LeftUpperTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++) {
            for(int k=0;k<n-i;k++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

