class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean isWordStarted = false;
        for(int i = s.length() -1 ; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count++;
                isWordStarted = true;
            } else if(isWordStarted) {
                break;
            }
        }
        return count;
        }   
    }
