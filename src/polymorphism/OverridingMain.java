package polymorphism;

public class OverridingMain {
    public static void main(String[] args) {
        Parent p2= new Child();
        p2.show1(); //will call parent's method bcz there is no detection of overriding
        p2.show(); //detect overriding so child
    }
}
