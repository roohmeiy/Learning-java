package stringPackage;

import java.util.Arrays;

public class StringFunctions {
    public static void main(String[] args) {

        //length
        String a = "   ";
        System.out.println(a.length()); //includes space as well
        System.out.println();

        //empty and blank
        System.out.println(a.isEmpty()); //it considers whitespaces as well
        System.out.println(a.isBlank()); //it don't consider white spaces

        //trim
        System.out.println();
        String str = "    Pihu      Sharma   ";
        System.out.println(str.trim()); //remove leading and trailing space

        //.equals and .equalsIgnoreCase
        System.out.println();
        String email = "roohmeiy@gmail.com";
        String password = "154464";
        if (email.equalsIgnoreCase("roohmeiy@gmail.com") && password.equals("45488"))
            System.out.println("authentication failed");

        //compare to -> lexicographical check values while converting into ascii
        //Lexicographical comparison (returns 0 if equal, -ve if smaller, +ve if larger).
        System.out.println();
        String str2 = "A";
        String str3 = "a";
        System.out.println(str3.compareTo(str2));
        System.out.println(str3.compareToIgnoreCase(str2));

        //concat
        System.out.println();
        String s = "Hello".concat(" World");
        System.out.println(s); // "Hello World"

        //substring
        System.out.println();
        String subStr = "Hello World";
        System.out.println(subStr.substring(6));    // "World" (from index 6)
        System.out.println(subStr.substring(6, 11)); // start from 0 index and last one will be ignored

        //charAt()
        System.out.println();
        System.out.println("Java".charAt(2)); // 'v'
        String s2 = "Java";
        System.out.println(s2.charAt(2)); //v

        //toCharArray()
        System.out.println();
        char[] s3 = s2.toCharArray();
        System.out.println(s3[0]);

        //indexOf() & lastIndexOf()
        System.out.println();
        String s4 = "Hello World";
        System.out.println(s4.indexOf("o"));
        System.out.println(s4.lastIndexOf("o"));

        //contains() -> check if a substring exists -> not case sensitive
        System.out.println();
        System.out.println("Java".contains("av")); // true
        System.out.println("Java".contains("Av"));

        //startsWith() & endsWith() ------>Checks if a string starts/ends with a substring.
        System.out.println();
        System.out.println("Java".startsWith("Ja")); // true
        System.out.println("Java".endsWith("va"));   // true

        //checking no. of digits in int num
        System.out.println();
        int n = 10;
        String n1 = String.valueOf(n); //method chaining
        System.out.println(n1.length());

        //replace ->replace all occurence of character
        System.out.println();
        String s5 = "Hello Hello";
        System.out.println(s5.replace("ll", "xx"));

        //replaceAll ---> Replaces all substrings matching a regex.
        System.out.println();
        System.out.println("a1b2c3".replaceAll("\\d", "-")); // "a-b-c-"

        //replace first ------>   Replaces only the first match.
        System.out.println();
        System.out.println("a1b2c3".replaceFirst("\\d", "-")); // "a-b2c3"

        //toLowerCase()/toUpperCase
        System.out.println();
        System.out.println("Java".toLowerCase());
        System.out.println("Java".toUpperCase());

        //        // split(String regex) ----> Splits a string into an array using a delimiter.  --> will work on words

        String s9 = "Hello my name is Pihu";
        String[] parts = s9.split(" ");
        for (String x : parts)
            System.out.print(x);

        System.out.println();
        String s10 = "Pihu";
        String[] p = s10.split("i");
        System.out.println(p[1]);
//        for(int i=0;i<p.length;i++)
//            System.out.println(p[i]);

        //subsequence
        System.out.println();
        String s11 = "cloudnative";
        CharSequence cs = s11.subSequence(5, 11);
        System.out.println(cs);


        String str9 = "THIS   IS FIRST DEMO";
        char[] lower = str9.toCharArray();
        for (int i = 0; i < lower.length; i++) {
            if (lower[i] >= 'A' && lower[i] <= 'Z')
                lower[i] += 32;
        }
        System.out.println(lower);
    }
}
