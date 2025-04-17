package exception_handling;

public class UnderAgeException  extends Exception{
    UnderAgeException(){
        super();
        System.out.println("u can't vote");
    }
    UnderAgeException(String msg){
        super(msg);
        System.out.println("u can't vote");

    }
}
