class Solution {
    public int sumOfSquares(int[] nums) {
        int answers = 0;
        for(int i = 1; i<= nums.length; i++) {
            if(nums.length%i == 0) {
                answers += nums[i-1]*nums[i-1];
            }
        }
        return answers;
    }
}
