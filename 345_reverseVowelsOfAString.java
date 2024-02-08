class Solution {
    public String reverseVowels(String s) {
        //convert the string into array containing characters
        char[] arr = s.toCharArray();
        int left= 0;
        int right = arr.length - 1;

        while(left < right) {
            while(left < right && isVowel(arr[left]) == false){
                left++; 
            } 

            while(left< right && isVowel(arr[right]) == false) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);       
    }
    
    //create method to check if it's a vowel
    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }
}
