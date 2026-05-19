class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        int m = grid.length, n = grid[0].length;
        boolean [][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == '1' && !visited[i][j]){
                    ans++;
                    visited[i][j] = true;
                    dfs(grid,i,j,visited);
                }
            }
        }
        return ans;
    }
    void dfs(char[][] grid, int i, int j, boolean[][] visited){
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        for (int k = 0; k < 4; k++){
            int x = i + dir[k][0];
            int y = j + dir[k][1];
            if (isValid(grid,x,y,visited)){
                visited[x][y] = true;
                dfs(grid,x,y,visited);
            }
        }
    }
    boolean isValid(char[][] grid, int i, int j, boolean[][] visited){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return false;
        if (grid[i][j] == '0') return false;
        return (!visited[i][j]);
    }
}