package keywords.thisPackage;

public class Class2 {
    void m1(){
        System.out.println("m1");
        m2(this);
        System.out.println(this);
    }
    void m2(Class2 ob){
        System.out.println(ob);
        System.out.println(this);
    }

    public static void main(String[] args) {
        Class2 obj= new Class2();
        obj.m1();
    }
}
