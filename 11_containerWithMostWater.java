class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length -1;
        
        while(i < j) {
             int width = j -i;
            int area = width*Math.min(height[i], height[j]);
            if(height[i] < height[j]){
                i++;
            } else {
                j--;
            }
            if(maxArea<area) {
                maxArea = area;
            }

        }
        return maxArea;

}
}
