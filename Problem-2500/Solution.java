class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            Arrays.sort(grid[i]);
        }

        int answer = 0;

        for (int j = 0; j < cols; j++) {

            int greatest = 0;

            for (int i = 0; i < rows; i++) {
                greatest = Math.max(greatest, grid[i][j]);
            }

            answer = answer + greatest;
        }

        return answer;
    }
}
