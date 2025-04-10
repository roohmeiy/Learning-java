package loops;

public class Pyramid {
    void pyramid(){
        for(int i=1;i<=4;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
