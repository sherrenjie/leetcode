class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;

        if(x < 0 ) {
            return false;
        }
        
        if(returnPalindrome(x, reverse) == x) {
            return true;
        } else {
            return false;
        }
    }

    public int returnPalindrome(int x, int reverse) {
        while(x != 0) {
            int remainder = x % 10;
            reverse = reverse*10 + remainder;
            x = x/10;
        }
        return reverse;
    }
}
