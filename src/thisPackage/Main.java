package thisPackage;

public class Main {
    public static void main(String[] args) {
//        Class1 ob=new Class1();
//        //ob and this both refers to class 1, so same address will be printed
//        System.out.println(ob);
//        ob.address();
//        Test t=new Test();
//        t.test();
        ReturnTest rt=new ReturnTest();
        ReturnTest rt2= rt.returnTest();
        System.out.println(rt2);
    }
}
