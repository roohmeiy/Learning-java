package stringPackage;

public class RedundantCharactersInString {
    void redundantCharacters(){
        int[] count=new int[128];
        String line="My name is Payal";

       line= line.replace(" ","");
       char[] ch= line.toCharArray();

       for (char x: ch)
           count[x]++;

        for(char x: ch){
            if(count[x]>1) {
                System.out.println(x);
                count[x] = 0;
            }
        }
    }

}
