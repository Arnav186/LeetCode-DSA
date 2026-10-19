class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        boolean[][] visited = new boolean[rows][columns];

        int currentR = 0;
        int currentC = 0;

        visited[currentR][currentC] = true;

        while(true){
            int nextR = currentR;
            int nextC = currentC;

            char dir = grid[currentR][currentC];

            if(dir == 'L'){
                nextC--;
            } else if (dir == 'R'){
                nextC++;
            } else if (dir == 'U'){
                nextR--;
            } else {
                nextR++;
            }

            if(nextR < 0 || nextR >= rows || nextC < 0 || nextC >= columns){
                break;
            }

            if(visited[nextR][nextC]){
                break;
            }

            currentC = nextC;
            currentR = nextR;
        
            visited[currentR][currentC] = true;
        }
        return new int[]{currentR, currentC};
    }
}
