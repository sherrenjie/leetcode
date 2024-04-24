class Solution {
    public int dominantIndex(int[] nums) {
       int largest = Integer.MIN_VALUE;
       int index = -1;

        //find largest integer 
       for(int i = 0; i < nums.length; i++) {
        if(nums[i] > largest) {
            largest = nums[i];
            index = i;
        }
       }

       for(int j = 0; j < nums.length; j++) {
        if(largest < nums[j] + nums[j] && index != j) {
            return -1;
        }
    }
    return index;
    }
}
