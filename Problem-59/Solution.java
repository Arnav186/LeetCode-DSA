class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        int num = 1;

        while(left <= right){

            for (int i = left; i <= right; i++){
                result[top][i] = num++;
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                result[j][right] = num++;
            }
            right--;
        
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    result[bottom][k] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    result[l][left] = num++;
                }
                left++;
            }
        }
        return result;
    }
}
