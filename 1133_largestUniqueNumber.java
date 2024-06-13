class Solution {
    public int largestUniqueNumber(int[] nums) {
        int largest = -1;
        Map<Integer,Integer> count = new HashMap<>();
        for(int num : nums) {
            count.put(num, count.getOrDefault(num,0)+1);
        }
        for(int num: nums) {
            if(count.get(num) == 1 && num > largest) {
                largest = num;
            }

        }
        return largest;

    }
}
