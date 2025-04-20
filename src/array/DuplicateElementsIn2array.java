package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class DuplicateElementsIn2array {
    int []a1={10,20,30,10};
    int []a2={50,60,20,60,80};

    void duplicateElementsIn1array(){
        Arrays.sort(a1);
        Arrays.sort(a2);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< a1.length-1 ;i++){
            if(a1[i]==a1[i+1]){
                if(i==0 || a1[i] !=a1[i-1])
                    System.out.println(a1[i]);
            }
            else
                list.add(a1[i]);
        }
        for(int j=0;j< a2.length-1 ;j++) {
            if (a2[j] == a2[j + 1]) {
                if (j == 0 || a2[j] != a2[j - 1])
                    System.out.println(a2[j]);
            }
            else
                list.add(a2[j]);
        }

        for (int k=0; k< list.size()-1; k++ ){
            if(Objects.equals(list.get(k), list.get(k + 1))){
                if(k==0 || !Objects.equals(list.get(k), list.get(k - 1)))
                    System.out.println(list.get(k));
            }
        }
    }
}
