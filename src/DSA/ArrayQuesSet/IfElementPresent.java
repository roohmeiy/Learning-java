package anonymousQuesSet;

public class IfElementPresent {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        boolean result = isPresent(arr, 7);
        System.out.println(result);
    }

    static boolean isPresent(int[] arr, int num){
        for(int i: arr){
            if(i==num){
                return true;
            }
        }        return false;
    }
}
