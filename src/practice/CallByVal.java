package practice;

public class CallByVal {
    void modify(int num){
        num=num+10;
        System.out.println(num);
    }
    public static void main( String[] args){
        int original=10;
        System.out.println("Before Passing: " + original);
        CallByVal m=new CallByVal();
        m.modify(original);
        System.out.println("After Passing: " + original);
    }
}

