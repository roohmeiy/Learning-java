package keywords.thisPackage;

public class Class1 {
    Class1(){
        this(20);
        System.out.println("constructor 1");
    }
    Class1(int n){
        this(10,20);
        System.out.println("constructor 2");
    }
    Class1(int n1, int n2){
        System.out.println("constructor 3");
    }
    void address(){
        System.out.println(this);
        this.fun(); //calling same class fun
        fun();
    }
    void fun(){
        System.out.println("this is fun1");
    }
}
