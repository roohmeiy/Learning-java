package polymorphism;

public class Mainoverload {
    // standard main method
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main("pihu"); // calling overloaded version
        main(10);
    }

    // overloaded main method
    public static void main(int x) {
        System.out.println("Overloaded main with int: " + x);
    }

    public static void main(String arg) {
        System.out.println("Overloaded main with String: " + arg);
    }
}
