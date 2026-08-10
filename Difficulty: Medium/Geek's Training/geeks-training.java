class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        int [][] dp = new int[mat.length][4];
        return rec(mat.length - 1, 3, mat,dp);
    }
    
    int rec(int day, int task, int[][] mat, int[][] dp) {
        if (day < 0) return 0;
        if (dp[day][task] != 0) return dp[day][task];
        int ans = 0;
        for (int i = 0; i <= 2; i++){
            if (i != task){
                ans = Math.max(ans,mat[day][i] + rec(day - 1, i, mat, dp)); 
            }
        }
        return dp[day][task] = ans;
    }
}