package keywords.thisPackage;

public class Test {
        void test(){
         Demo d= new Demo(this); }
}
class Demo{
    Demo(Test t){
        System.out.println(t);
    }
}
