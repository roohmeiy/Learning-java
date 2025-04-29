package stringPackage;

public class ReverseString {
    void stringReverse(String name) {
        /* char[] rev = name.toCharArray();
        String reverse = "";

        for (int i = name.length()-1; i >= 0; i--) {
            reverse += rev[i];
        }

        System.out.println("Reversed: " + reverse);

         */
        String rev="" ;
        for (int i=name.length()-1;i>=0;i--)
            rev=rev+name.charAt(i);
        System.out.println(rev);
    }
}
