class Solution {
    public int[] plusOne(int[] digits) {
        //store the length of digit
        int size = digits.length;

        //loop through the array and increment the last digit by 1 if it is not 9
        for(int i = size -1; i >=0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        //handle resize array when digits are 9
        int[] newNumber = new int[size + 1];
        //element of the first index is 1
        newNumber[0] = 1;
        return newNumber;
           
    }
}
