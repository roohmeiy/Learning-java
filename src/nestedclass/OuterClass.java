package nestedclass;

public class OuterClass {
    private int a=10;
    static int  b=20;
    private static int c=30;
    class InnerClass{
        void innerFun(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
    static class StaticNestedClass{
        void innerFun(){
//            System.out.println(a); //error
            System.out.println(b);
            System.out.println(c);
        }
    }
}
