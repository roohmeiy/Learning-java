package keywords.superPackage;

public class Parent extends SuperParent {
    int a=10;
    void p1(){
        System.out.println("Parent class method");
    }
    Parent(){
        super();
        System.out.println("Parent class constructor");
    }
}
