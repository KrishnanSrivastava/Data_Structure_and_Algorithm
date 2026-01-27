class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int [][] dp = new int[wt.length + 1][W + 1];
        
        for (int i = 1; i <= wt.length; i++){
            for (int j = 1; j <= W; j++){
                int take = 0;
                if (wt[i - 1] <= j){
                    take = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                }
                int notake = dp[i - 1][j];
                dp[i][j] = Math.max(take,notake);
            }
        }
        return dp[wt.length][W];
    }
}
