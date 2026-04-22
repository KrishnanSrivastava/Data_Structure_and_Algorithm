class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int [grid.length][grid[0].length];
        for (int[] i : dp) Arrays.fill(i,-1);
        return rec(0,0,grid,dp);
    }
    int rec(int i,int j, int[][] grid, int[][] dp){
        if (i == grid.length - 1 && j == grid[0].length - 1) return grid[i][j];
        if (i >= grid.length || j >= grid[0].length) return Integer.MAX_VALUE;
        if (dp[i][j] != -1) return dp[i][j];
        int right =  rec(i+1,j,grid,dp);
        int down =  rec(i,j+1,grid,dp);
        return dp[i][j] = grid[i][j] + Math.min(right,down);
    }
}