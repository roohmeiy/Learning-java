package anonymousQuesSet;


public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(nums, target);
        System.out.println("Insert position: " + result);
    }
    public int searchInsert(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>=target)
                return i;
            i++;
        }
        return i;
    }
}


