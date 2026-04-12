class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a = 0;
        int b = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        while (a < m && b < n){

            for (a = 0; a < m; a++){
                for (b = 0; b < n; b++){
                    if (matrix[a][b] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
