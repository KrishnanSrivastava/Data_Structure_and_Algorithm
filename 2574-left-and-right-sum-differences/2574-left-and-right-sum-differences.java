class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int [] prefix = new int[n];
        int [] ans = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }
        for (int i = 0; i < n; i++){
            ans[i] = Math.abs(2 * prefix[i] - nums[i] - prefix[n-1]);
        }
        
        return ans;
    }
}