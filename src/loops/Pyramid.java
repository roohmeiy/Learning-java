package loops;

public class Pyramid {
    void pyramid(){
        for (int i = 1; i <= 4; i++) {
            // Print spaces for center alignment
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // Print the number i, i times
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }
}

