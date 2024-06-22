class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double sum = 0;
        for(int i = 0; i< k;i++) {
            sum+= nums[i];
        }
        avg = sum/k;
        double ans = avg;
        for(int i =k; i < nums.length; i++) {
            sum+= nums[i] - nums[i-k];
            avg = sum/k;
            ans= Math.max(ans, avg);
        }
        return ans;
    }
}
