package exception_handling;

public class DividedByZero {
    public static void main(String[] args) {
        int a=100;
        int b=0;

        //try catch finally

        /*\
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("I will always run");
        }

         */


        //try catch  throw

        try{
            int c=a/b;
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println("Arithemtic exception occurred");
        }
        System.out.println("i will also execute");
    }
}
