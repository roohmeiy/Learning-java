package keywords.staticPackage;

public class PageCounter {
    static int count=0;
    PageCounter(){
        count+=1;
//        System.out.println(count);
    }
    void display(){
        System.out.println(count);
    }
    static{
        System.out.println(4);
    }
}
