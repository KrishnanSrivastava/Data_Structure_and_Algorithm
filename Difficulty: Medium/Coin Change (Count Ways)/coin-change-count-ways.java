class Solution {
    public int count(int coins[], int sum) {
        // code here.
        int [][] dp = new int [coins.length + 1][sum + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= coins.length; i++){
            for (int j = 0; j <= sum; j++){
                dp[i][j] += dp[i - 1][j];
                if (j >= coins[i - 1]) dp[i][j] += dp[i][j - coins[i - 1]];
            }
        }
        return dp[coins.length][sum];
    }
}