class Solution {
    public boolean canPartition(int[] nums) {
        int tsum = 0;

        for (int i : nums)
            tsum += i;
        int[][] dp = new int[nums.length][tsum];
        return rec(nums, 0, 0, tsum, dp);
    }

    boolean rec(int[] nums, int i, int sum, int tsum, int[][] dp) {
        if (i == nums.length) {
            return false;
        }
        if (sum * 2 == tsum) {
            dp[i][sum] = 1;
            return true;
        }

        if (dp[i][sum] == 1)
            return true;
        if (dp[i][sum] == 2)
            return false;

        dp[i][sum] = rec(nums, i + 1, sum, tsum, dp) || rec(nums, i + 1, sum + nums[i], tsum, dp) ? 1 : 2;

        return (dp[i][sum] == 1);
    }
}