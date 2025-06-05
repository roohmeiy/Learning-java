package anonymousQuesSet;
/* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.*/

class ReturnUniqueElementCount {
    public int removeDuplicates(int[] nums) {

        /* approach 1*/
//        HashSet<Integer> set = new java.util.HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        for(int i=0;i<nums.length && i<set.size();i++) {
//
//            nums[i] = set.toArray(new Integer[0])[i];
//
//        }
//        return set.size();


         int i = 0;
         for (int j = 1; j < nums.length; j++) {
             if (nums[j] != nums[i]) {
                 i++;
                 nums[i] = nums[j];
             }
         }
         return i + 1;
    }
/* best approach*/
    public static void main(String[] args) {
        ReturnUniqueElementCount returnUniqueElementCount = new ReturnUniqueElementCount();
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int result = returnUniqueElementCount.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + result);
    }
}