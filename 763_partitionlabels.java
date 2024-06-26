class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c,i);
        }
        int max= 0;
        int prev = 0;
        for(int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            max = Math.max(max, map.get(c));

            if(max == i) {
                res.add(max-prev+1);
                prev = i+1;
            }
        }
        return res;
    }
}
