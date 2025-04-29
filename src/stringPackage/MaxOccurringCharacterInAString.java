package stringPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxOccurringCharacterInAString {
    void maxOccurCount(String line) {
        int count = 0;
        int maxCount = 0;
        ArrayList<Character> maxOccurred = new ArrayList<>();

        line = line.replace(" ", ""); // remove all spaces

        char[] ch = line.toCharArray();
        Arrays.sort(ch);    //sortArray

        //logic
        for (int i = 0; i < ch.length-1; i++) {
            if (i == 0)
                count = 1;
            else if((ch[i] != ch[i -1])){
                count=1;
            }
            else if ((ch[i] == ch[i -1])) {
                count++;
                    if(maxCount < count) {
                        maxCount = count;
                        maxOccurred.clear();
                        maxOccurred.add(ch[i]);
                    } else if (maxCount==count) {
                        maxOccurred.add(ch[i]);
                    }
            } else {
                count++;
            }
        }

            System.out.println("The most occurred character(s) is " + maxOccurred + " and no. of occurrence: " + maxCount + " times.");
    }
}
