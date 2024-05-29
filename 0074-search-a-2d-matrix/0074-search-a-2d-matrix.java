class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
       int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0;
        int c = cols - 1;
        while (r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            } 
        }
        return false;
    }
}