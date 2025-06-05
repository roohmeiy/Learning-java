package anonymousQuesSet;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,8451,12,41};
        maxElement(arr);
    }
    static void maxElement(int[] arr){
        if(arr==null || arr.length==0)
            System.out.println("Array is empty");
        else{
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max)
                    max=arr[i];
            }
            System.out.println("max element:" + max);
        }

    }
}
