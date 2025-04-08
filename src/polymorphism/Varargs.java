package polymorphism;

public class Varargs {
    void display(int a){
        System.out.println("hii from int");
    }
    void display(int... a){
        System.out.println("hii from varargs");
        for(int i:a){
            System.out.println(i);
        }
    }
}
