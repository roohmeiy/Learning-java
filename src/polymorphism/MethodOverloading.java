package polymorphism;

public class MethodOverloading {
    void sum(int a){
        System.out.println(a+a);
    }
    void sum(int a, double b){
        System.out.println(a+b);
    }
    void sum(String a, String b){
        System.out.println(a+b);
    }
}
