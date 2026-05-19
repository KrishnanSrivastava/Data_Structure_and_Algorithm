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
                    bfs(grid,i,j,visited);
                }
            }
        }
        return ans;
    }
    void bfs(char[][] grid, int i, int j, boolean[][] visited){
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        Queue <int[]> que = new LinkedList<>();
        int[] arr = {i,j};
        que.add(arr);
        while(!que.isEmpty()){
            int[] q = que.poll();
            for (int k = 0; k < 4; k++){
                int x = q[0] + dir[k][0];
                int y = q[1] + dir[k][1];
                if (isValid(grid,x,y,visited)){
                    visited[x][y] = true;
                    int[] a = {x,y};
                    que.add(a);
                }
            }
        }
    }
    boolean isValid(char[][] grid, int i, int j, boolean[][] visited){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return false;
        if (grid[i][j] == '0') return false;
        return (!visited[i][j]);
    }
}