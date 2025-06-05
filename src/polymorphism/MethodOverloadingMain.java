package polymorphism;

public class MethodOverloadingMain {
    public static void main(String[] args) {
        MethodOverloading ob= new MethodOverloading();
        ob.sum(1);
        ob.sum(1,2.1);
        ob.sum("Pihu ", "Sharma");

        System.out.println();

        Varargs v=new Varargs();
        v.display(10);
        v.display(10,20,30);
        v.display();

        System.out.println();

        Test t=new Test();
        t.display(null); // ans=2 bcz child class is preferred
    }
}
