class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length -1;
        int[] res = new int[nums.length];
        int k = res.length-1;

        while(k >= 0) {
            if(nums[i]* nums[i] > nums[j]*nums[j]){
                res[k] = nums[i]*nums[i];
                i++;
            } else {
                res[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }
            return res;
    }
}
