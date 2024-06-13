class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int val: arr) {
            count.put(val, count.getOrDefault(val, 0) + 1);
        }

        Set<Integer> occurences = new HashSet<>();
        for(int occurence: count.values()){
            if(!occurences.add(occurence)){
                return false;
            }
        }
        return true;
    }
}
