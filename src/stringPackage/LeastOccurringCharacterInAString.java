package stringPackage;

import java.util.Arrays;

public class LeastOccurringCharacterInAString {
    void leastOccurCount(){
        String line="aaa bbb c dd";
        char minOccurred =' ';
        int[] count=new int[128];
        int minCount=line.length();

        line = line.replace(" ", ""); // remove all spaces

        char[] ch = line.toCharArray();

        for(char x: ch)
            count[x]++;

        for(char x:ch ){
            if( count[x] >0 && count[x]<minCount){
                minCount=count[x];
                minOccurred=x;
            }
        }
        System.out.println(minCount);
        System.out.println(minOccurred);
    }
}
