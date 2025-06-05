package keywords.staticPackage;
// Static blocks in Java are executed only once when the class is loaded into memory (before the main() method runs).
public class StaticClassEx {
    static{
        System.out.println(1);
    }

    public static void main(String[] args) {
        System.out.println(2);
        PageCounter p= new PageCounter();
    }
    static{
    System.out.println(3);
}

}

