class Solution {
    public int findFinalValue(int[] nums, int original) {
        int i = 0;
        while( i != nums.length) {
            if(nums[i] == original) {
                i = 0;
                original *= 2;
            } else{
                i++;
            }
        }
        return original;
    }
}
