package superPackage;

import java.sql.SQLOutput;

public class Child extends Parent{
    int a=20;
    Child(){
        System.out.println("Child constructor");
        super();
    }
    void c1(int a){
        super.p1();
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        this.c2();

    }
    void c2(){
        System.out.println("Method Chaining");
    }
}
