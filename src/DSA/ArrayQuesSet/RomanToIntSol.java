package anonymousQuesSet;

import java.util.HashMap;

public class RomanToIntSol {

    public static void main(String[] args) {
        RomanToIntSol solution = new RomanToIntSol();
        int result = solution.romanToInt("MCMXCIV"); //1994
        System.out.println("The integer value of the Roman numeral is: " + result);
    }
    public int romanToInt(String s) {
        if (s == null || s.length() == 0 || s.length() > 15) return 0;
        HashMap<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int sum=0;
        int prev=0;

        for (int i =s.length()-1;i >=0;i--) {
            int val = romanMap.get(s.charAt(i));
            if (val < prev)
                sum -= val;
            else
                sum += val;
            prev = val;
        }
        return sum;

    }
}

//2nd way
// public int romanToInt(String s) {
    //     int I=1;
    //     int V=5;
    //     int X=10;
    //     int L=50;
    //     int C=100;
    //     int D=500;
    //     int M=1000;
    //     s=s +"z"; // Adding a dummy character to avoid index out of bounds exception
    //     if(s.length()>=0 && s.length()<=15)
    //     {
    //         int sum=0;
    //         for(int i=0;i<s.length();i++)
    //         {
    //             if(s.charAt(i)=='I')
    //             {
    //                 if(s.charAt(i+1)=='V') {
    //                     sum +=( V - I);
    //                     i++;
    //                 } else if (s.charAt(i+1)=='X') {
    //                     sum+=(X-I);
    //                     i++;
    //                 }
    //                 else
    //                     sum+=I;
    //             }

    //             else if(s.charAt(i)=='V')
    //             {
    //                 sum+=V;
    //             }

    //             else if(s.charAt(i)=='X')
    //             {
    //                 if(s.charAt(i+1)=='L') {
    //                     sum +=(L - X);
    //                     i++;
    //                 } else if (s.charAt(i+1)=='C') {
    //                     sum+=(C-X);
    //                     i++;
    //                 }
    //                 else
    //                     sum+=X;
    //             }

    //             else if(s.charAt(i)=='L')
    //             {
    //                 sum+=L;
    //             }

    //             else if(s.charAt(i)=='C')
    //             {
    //                 if(s.charAt(i+1)=='D') {
    //                     sum +=(D-C);
    //                     i++;
    //                 } else if (s.charAt(i+1)=='M') {
    //                     sum+=(M-C);
    //                     i++;
    //                 }
    //                 else
    //                     sum+=C;
    //             }

    //             else if(s.charAt(i)=='D')
    //             {
    //                 sum+=D;
    //             }

    //             else if(s.charAt(i)=='M')
    //             {
    //                 sum+=M;
    //             }
    //         }
    //         return sum;
    //     }

    //     else
    //         return 0;
    // }