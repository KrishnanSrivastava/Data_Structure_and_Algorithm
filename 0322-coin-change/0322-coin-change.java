class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for (int[] i : dp) Arrays.fill(i,-1);

        int ans = rec(coins,0,amount,dp);
        return (ans == Integer.MAX_VALUE)? -1 : ans;
    }
    int rec(int[] coins, int i, int amount,int[][] dp){
        if (amount == 0) return 0;
        if (amount < 0 || i >= coins.length) return Integer.MAX_VALUE;
        if (dp[i][amount] != -1) return dp[i][amount];

        int n = rec(coins,i,amount-coins[i],dp);
        int pick = (n == Integer.MAX_VALUE)? n : n + 1;
        int notpick = rec(coins,i+1,amount,dp);
        return dp[i][amount] = Math.min(pick,notpick);
    }
}