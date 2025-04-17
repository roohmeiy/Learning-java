package thisPackage;

public class Class2 {
    void m1(){
        System.out.println("m1");
        m2(this);
    }
    void m2(Class2 ob){
        System.out.println(ob);
    }

    public static void main(String[] args) {
        Class2 obj= new Class2();
        obj.m1();
    }
}
