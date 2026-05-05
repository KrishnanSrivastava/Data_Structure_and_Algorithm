class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return rec(nums, 0, dp);
    }

    int rec(int[] nums, int i, int[] dp) {
        if (i >= nums.length - 1)
            return 0;

        if (dp[i] != -1)
            return dp[i];
        int ans = 10000;
        for (int j = 1; j <= nums[i]; j++) {
            ans = Math.min(ans, 1 + rec(nums, i + j, dp));
        }
        return dp[i] = ans;
    }
}