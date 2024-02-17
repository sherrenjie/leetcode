class Solution {
    public boolean isAnagram(String s, String t) {
        // if length of string is different then it is not anagram
        if(s.length() != t.length()) {
            return false;
        }

        char a[] = new char[s.length()];
        char b[] = new char[t.length()];

        for(int i =0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }

        for(int i = 0; i < t.length(); i++){
            b[i] = t.charAt(i);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
        
    }
}
