package anonymousQuesSet;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j=nums.length-1;
        for(int i=0;i<=j;i++){
            if(nums[i]!=val){
                count++;
            }
            else{
                while (j>i){
                    if(nums[j]!=val){
                        nums[i]=nums[j];
                        j--;
                        count++;
                        break;
                    }
                    j--;

                }
            }
        }
        for(int x: nums)
            System.out.println(x);

        return count;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = { 3,2,2,3 }; // 01403
        int val = 3;
        int newLength = removeElement.removeElement(nums, val);
        System.out.println("New length: " + newLength);
    }
}
