package keywords.finalPackage;

public class FinalMethodEx {
    final void fun(){
        System.out.println("It can't be overriden");
    }
}

 class C2 extends  FinalMethodEx{
    //it will give error
//    void fun(){}
}
