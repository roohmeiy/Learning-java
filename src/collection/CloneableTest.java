package collection;

public class CloneableTest implements Cloneable {
    String name;
    int age;
    CloneableTest(){

    }
    CloneableTest(String name, int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableTest ob=new CloneableTest("Payal",20);
        CloneableTest ob2 = (CloneableTest) ob.clone();
        System.out.println(ob2.age);
        System.out.println(ob2.name);
    }
}

//Even though your class CloneableTest implements Cloneable, you're not overriding the clone() method from Object class.
//That’s why calling ob.clone() causes a CloneNotSupportedException at runtime.
//
//        Fix: You need to override the clone() method in your class.
//          public Object clone() throws CloneNotSupportedException {
//          return super.clone();
//          }