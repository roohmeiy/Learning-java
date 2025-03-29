package practice;

public class WrapperClasses {
    public static void main(String[] args){

        //size

        /*
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        */

        //auto boxing


        /*
        int a=10;
        Integer i=a;
        Integer ii=Integer.valueOf(a); //old method
        System.out.println(i);
        System.out.println(ii);
         */

        //unboxing
        Integer a=10;
        int ii=a;
        int i=a.intValue(); //old method
        System.out.println(a);
        System.out.println(i);
        System.out.println(ii);


    }
}
