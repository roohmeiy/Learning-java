package stringPackage;

import java.util.Arrays;

public class ReverseWordsInString {
    void reverseWords(String line){
        System.out.println(line);
        String reversedLine="";
        String[] arr= line.split(" ");
        String temp;
            for(int start=0, end= arr.length-1;  start<=end; start++, end--){
                temp= arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
//        for(String x: arr){
//                x=x+" ";
//        }
        for(int i=0;i<arr.length-1;i++)
            arr[i]=arr[i]+" ";
        for(String x: arr){
            System.out.print(x);
        }



    }
}
