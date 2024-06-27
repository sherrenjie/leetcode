class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int count = 0;
       for(int i = 0; i < flowerbed.length; i++) {
        if (flowerbed[i] == 0) {
          //if i is at 0, that means previous is empty, so we can place flower there
            boolean prevEmpty = (i==0) || (flowerbed[i-1] == 0);
          //if i is at the last element of array, that means the next is empty, so can place flower there
            boolean nextEmpty = (i == flowerbed.length-1) || (flowerbed[i+1] == 0);
          //make sure to change zero to 1, so to update, in case next iteration will affect
            if(prevEmpty&& nextEmpty) {
                flowerbed[i] = 1;
                count++;
             }
       }
        }
      // this question is about whether it is possible to plant the n number of flowers, so as long as count is bigger or equal to n, return true because it means it is possible to plant
       if(count >= n) {
        return true;
       }
       return false;
       
    }
}
