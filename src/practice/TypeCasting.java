package practice;
// byte, short, int(any calculation = int; (output will be of higher data type also in the case of float, double)
public class TypeCasting {
   public static void main(String[] args){
       // byte -> short ->
       float c= 10; //can store value of lesser DT
//    byte b=124644; can't store value more than range
       int i=15;
       byte b=(byte)i;
       short s=25;
       byte b1= (byte)s;
       System.out.println(b);
       System.out.println(b1);
   }
}
