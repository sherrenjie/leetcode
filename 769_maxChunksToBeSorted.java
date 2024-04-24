class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxImpact = 0;
        int chunk = 0;

        //chaining method
        for(int i =0; i< arr.length; i++) {
            maxImpact = Math.max(maxImpact, arr[i]);

            if(i == maxImpact) {
                chunk++;
            }
        }
        return chunk;
    }
}
