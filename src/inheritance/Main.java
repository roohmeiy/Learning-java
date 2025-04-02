package inheritance;

class Class1{
    void fun1(){
        System.out.println("This is fun1");
    }
}
class Class2 extends Class1{
}
class Class3 extends Class2{

}
public class Main {
    public static void main(String[] args) {
        Class2 c2=new Class2();
        c2.fun1();
        Class3 c3=new Class3();
        c3.fun1();
    }
}
