package loops;

public class LabeledBreak{
    public static void main(String[] args) {
        outer:
        for(int i=1; i<=5;i++) {
            System.out.println(i);
            inner:
            for (int j = 1; j <= 5; j++) {
                if (i == 3) {
                    break outer;
                }
                System.out.println(j);
            }
        }
    }
}
