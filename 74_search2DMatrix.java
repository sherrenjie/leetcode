class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int i = n - 1;
        int j = 0;

        while(i >= 0 && j < matrix[0].length) {
            if(matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                i--; // move top
            } else{
                j++; //move right
            }
        }
        return false;
    }
}
