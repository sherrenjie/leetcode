class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //use set to store unique values of nums1
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }

        //check if there is intersection
        Set<Integer> intersection = new HashSet<>();
        for(int num: nums2) {
            if(set1.contains(num)) {
                intersection.add(num);
            }
        }

        //convert intersection set to array
        int[] result = new int[intersection.size()];
        int index = 0;
        for(int num: intersection) {
            result[index] = num;
            index++;
        }
        return result;


    }
}
