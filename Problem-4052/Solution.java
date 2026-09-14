class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] temp = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                temp[i][(j - rowShift[i] + n) % n] = grid[i][j];
            }
        }

        int[][] ans = new int[n][n];

        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                ans[(i - colShift[j] + n) % n][j] = temp[i][j];
            }
        }
        return ans;
    }
}
