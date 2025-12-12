class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return Math.max(rec(0, nums, memo), rec(1, nums, memo));
    }

    int rec(int i, int[] nums, int[] memo) {
        if (i == nums.length) return 0;
        if (memo[i] != -1) return memo[i];
        if (i >= nums.length - 2) return memo[i] = nums[i];
        return memo[i] = Math.max(nums[i] + rec(i + 2, nums, memo), nums[i] + rec(i + 3, nums, memo));
    }
}