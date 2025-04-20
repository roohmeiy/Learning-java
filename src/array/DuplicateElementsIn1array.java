package array;

import java.util.Arrays;

public class DuplicateElementsIn1array {
    int []arr={10,20,10,30,40,40,40,30,50,60,70,80,70,80,70};
    void duplicateElementsIn1array(){
        Arrays.sort(arr);
        System.out.println("Duplicate values are: ");
        for(int i=0;i< arr.length-1 ;i++){
            if(arr[i]==arr[i+1]){
                if(i==0 || arr[i] !=arr[i-1])
                    System.out.println(arr[i]);
            }
        }
    }

}
