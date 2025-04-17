package exception_handling;

public class LearnThrows {
   void fun() throws NullPointerException,ArithmeticException{
       String i=null;
       System.out.println(i.length());
       System.out.println("it will not execute");
   }

}
