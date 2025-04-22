package nestedclass;

public class Main {
    public static void main(String[] args) {
        OuterClass oc=new OuterClass();
        OuterClass.InnerClass ic= oc.new InnerClass();
        ic.innerFun();
        OuterClass.StaticNestedClass nestedObject
                = new OuterClass.StaticNestedClass();

        nestedObject.innerFun();

    }
}
